INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES
    (1, 'xx', 'yy', 'city', '62-030'),
    (2, 'Klonowa', '8A', 'Olesnica', '21-001'),
    (3, 'Makowa', '2', 'Wroclaw', '87-001'),
    (4, 'Wojska Polskiego', '10', 'Bystre', '60-601'),
    (5, 'Traugutta', '2B', 'Wroclaw', '77-001');

INSERT INTO PATIENT (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age)
VALUES
    (1, 'Marcin', 'Jama', '987654321', 'marcin.j@example.com', 'P01', '1990-01-01', 34),
    (2, 'Adam', 'Kowalski', '123456789', 'adam.n@example.com', 'P02', '1985-06-15', 39),
    (3, 'Ada', 'Nowak', '654321987', 'ada.n@example.com', 'P03', '1980-03-20', 44),
    (4, 'Robert', 'Kowalski', '789123456', 'robert.k@example.com', 'P04', '1977-12-10', 47),
    (5, 'Michal', 'Czarny', '583423456', 'michal.c@example.com', 'P05', '2000-09-09', 23);

INSERT INTO DOCTOR (id, first_name, last_name, telephone_number, email, specialization, doctor_number)
VALUES
    (1, 'Marcel', 'Jaworek', '987654321', 'marcel.j@example.com', 'SURGEON', 'D01'),
    (2, 'Artur', 'Stala', '123456789', 'artur.s@example.com', 'GP', 'D02'),
    (3, 'Dawid', 'Bronz', '654321987', 'dawid.b@example.com', 'DERMATOLOGIST', 'D03'),
    (4, 'Sara', 'Drwal', '789123456', 'sara.d@example.com', 'OCULIST', 'D04'),
    (5, 'Daniel', 'Lewis', '112233445', 'daniel.l@example.com', 'OCULIST', 'D05');

INSERT INTO VISIT (id, description, time, doctor_entity_id, patient_entity_id)
VALUES
    (1, 'Routine check-up', '2024-05-13 09:00:00', 1, 1),
    (2, 'Vaccination appointment', '2024-05-14 10:30:00', 2, 2),
    (3, 'Follow-up for knee surgery', '2024-05-15 14:00:00', 3, 3),
    (4, 'Skin condition evaluation', '2024-05-16 11:15:00', 4, 4),
    (5, 'Annual physical exam', '2024-05-17 09:00:00', 1, 1);

INSERT INTO MEDICAL_TREATMENT (id, description, type, visit_entity_id)
VALUES
    (1, 'Prescription for blood pressure medication', 'Medication', 1),
    (2, 'Administered flu vaccine', 'Vaccine', 2),
    (3, 'Physical therapy session', 'Therapy', 3),
    (4, 'Prescribed ointment for skin condition', 'Medication', 4),
    (5, 'General check-up and lab tests', 'Check-up', 5);

