CREATE TABLE PERSON (
    person_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    age INT CHECK (age >= 0),
    occupation VARCHAR(50) NOT NULL
);

CREATE TABLE PLACE (
    place_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    person_id INT REFERENCES PERSON(person_id) ON DELETE CASCADE
);
