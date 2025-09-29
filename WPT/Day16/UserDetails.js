import React, { useState } from 'react';

const GraduateComponent = () => (
  <div>
    <p>Degree: </p><input type="text" />
    <p>Year: </p><input type="number" />
    <p>Final Year Score: </p><input type="text" />
    <p>University: </p><input type="text" />
  </div>
);

const PGComponent = () => (
  <div>
    <p>Year:</p><input type="number" />
    <p>Thes is Subject:</p><input type="text" />
  </div>
);

const UnderGradComponent = () => (
  <div>
    <p>SSC Score: </p><input type="text" />
    <p>HSC Score: </p><input type="text" />
  </div>
);


const UserDetails = () => {
  const [educationLevel, setEducationLevel] = useState('');

  return (
    <div className="App">
      <h2>User Details Form</h2>
      <p>Name: <input type="text" /></p><br />
      <p>Email: <input type="email" /></p><br />

      <p>Education Level: 
        <select value={educationLevel} onChange={(e) => setEducationLevel(e.target.value)}>
          <option value="">--Select--</option>
          <option value="Graduate">Graduate</option>
          <option value="PG">PG</option>
          <option value="UnderGrad">UnderGrad</option>
        </select>
      </p>

      {educationLevel === 'Graduate' && <GraduateComponent />}
      {educationLevel === 'PG' && <PGComponent />}
      {educationLevel === 'UnderGrad' && <UnderGradComponent />}
    </div>
  );
};

export default UserDetails;
