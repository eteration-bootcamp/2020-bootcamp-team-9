package com.movie.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movie.springboot.models.Movie;
import com.movie.springboot.dto.UserDto;
import com.movie.springboot.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	private UserService _userService;

	// todo : Buraya pagination eklenebilir.
	@GetMapping("/user/{userId}/watched")
	public List<Movie> getWatched(@PathVariable String userId) {
		return _userService.getWatched(userId);
	}

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody UserDto userDto) {

		_userService.addUser(userDto);

		return new ResponseEntity<>("User added", HttpStatus.OK);
	}

	@PostMapping("/user/{userId}")
	public List<Movie> addMovie(@RequestBody Movie movie, @PathVariable String userId) {

		return _userService.addWatched(movie, userId);

	}

	@PostMapping("/user/watches/{userId}")
	public List<Movie> addWatchesMovie(@RequestBody Movie movie, @PathVariable String userId) {

		return _userService.addWatches(movie, userId);

	}

	@GetMapping("/user/{userId}/watches")
	public List<Movie> getWatchesMovies(@PathVariable String userId) {
		return _userService.getWatches(userId);
	}

	@DeleteMapping("/user/{userId}/watches/{trakt}")
	public List<Movie> deleteWatchesMovie(@PathVariable String userId, @PathVariable long trakt) {
		return _userService.removeWatches(trakt, userId);
	}

}
