DELETE FROM house;
INSERT INTO house (Name, Founder, Ghost, Mascot, Colors) VALUES
('Gryffindor', 'Godric Gryffindor', 'Nearly Headless Nick', 'Lion', 'Scarlet and Gold'),
('Slytherin', 'Salazar Slytherin', 'The Grey Lady', 'Serpent', 'Green and Silver'),
('Ravenclaw', 'Rowena Ravenclaw', 'The Grey Lady', 'Eagle', 'Blue and Bronze'),
('Hufflepuff', 'Helga Hufflepuff', 'The Fat Friar', 'Badger', 'Yellow and Black');

DELETE FROM character;
INSERT INTO character (Name, house_id, Birthdate, Gender, image) VALUES
('Harry Potter', 1, '1980-07-31', 'Male', 'https://ik.imagekit.io/hpapi/harry.jpg')
('Hermione Granger', 1, '1979-09-19', 'Female','https://ik.imagekit.io/hpapi/hermione.jpeg'),
('Ron Weasley', 1, '1980-03-01', 'Male','https://ik.imagekit.io/hpapi/ron.jpg');

DELETE FROM spell;
INSERT INTO spell (Name, Effect, Incantation) VALUES
('Expelliarmus', 'Disarms an opponent', 'Expelliarmus'),
('Lumos', 'Produces light from the casters wand', 'Lumos'),
('Expecto Patronum', 'Conjures a Patronus', 'Expecto Patronum');

DELETE FROM location;
INSERT INTO location (Name, Description, image) VALUES
('Hogwarts', 'A magical school for witches and wizards.','https://images.alphacoders.com/115/1156517.jpg');

DELETE FROM book;
INSERT INTO book (Title, ReleaseDate, Author) VALUES
('Harry Potter and the Philosopher Stone', '1997-06-26', 'J.K. Rowling');

DELETE FROM event;
INSERT INTO event (Title, Date, Description) VALUES
('First Year at Hogwarts', '1991-09-01', 'Harry Potter first year at Hogwarts School of Witchcraft and Wizardry.');

-- Insert into Join Table
INSERT INTO Character_Spells (character_id, spell_id) VALUES
((SELECT ID FROM Characters WHERE Name = 'Harry Potter'), (SELECT ID FROM Spells WHERE Name = 'Expelliarmus')),
((SELECT ID FROM Characters WHERE Name = 'Harry Potter'), (SELECT ID FROM Spells WHERE Name = 'Lumos'));