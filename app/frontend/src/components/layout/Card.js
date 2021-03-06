import React from "react";
import { Link } from "react-router-dom";
import cardImg from "../../images/cardImg.png"

const Card = ({ item }) => {
  return (
    <div className="card" id="movie_card">
      <div className="card-inner">
        <div className="card-front">
          <img className="img-fluid" src={item.moviePosterImage==="" ? "https://cdn1.thr.com/sites/default/files/imagecache/landscape_928x523/2012/11/movie_theater_interior_a_l.jpg" :item.moviePosterImage} alt={item.title}></img>
        </div>
        <div className="card-back">
          <Link to={`/movie/${item.ids.trakt}`}>
            <p style={{color: "white"}}>{item.title}</p>
          </Link>
          <ul> 
            <li>
              <strong>Year:</strong> {item.year}
            </li>
          </ul>
          <img src={cardImg} alt="Picture on the Card" style= {{width:"100%", height:"45%"}} />
        </div>
      </div>
    </div>
  );
};

export default Card;