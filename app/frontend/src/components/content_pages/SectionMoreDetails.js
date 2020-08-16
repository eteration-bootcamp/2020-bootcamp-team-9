import React, { Component } from "react";

export class SectionMoreDetails extends Component {
  render() {
    var {
      genres,
      overview,
      director,
      tagline,
      released,
      rating,
      country,
      votes,
    } = this.props;
    return (
      <section className="section-moredetails">
        <div className="container-details">
          <table className="table-details">
            <tbody>
              <tr>
                <th>Genres</th>
                <th>Overview</th>
              </tr>
              <tr>
                <td>{genres}</td>
                <td>{overview}</td>
              </tr>
              <tr>
                <th>Director</th>
                <th>Tagline</th>
              </tr>
              <tr>
                <td>{director}</td>
                <td>{tagline}</td>
              </tr>
              <tr>
                <th>Released</th>
                <th>Rating</th>
              </tr>
              <tr>
                <td>{released}</td>
                <td>{rating}</td>
              </tr>
              <tr>
                <th>Country</th>
                <th>Votes</th>
              </tr>
              <tr>
                <td>{country}</td>
                <td>{votes}</td>
              </tr>
            </tbody>
          </table>
        </div>
      </section>
    );
  }
}

export default SectionMoreDetails;