--Branches
INSERT INTO `branch` VALUES ( 1, 'East Branch', '22315', '1337 Sleepdeprived Road', 'Alexandria', '13:00:00', '23:00:00', 'ATM', '7031234567');
INSERT INTO `branch` VALUES ( 2, 'West Branch', '22079', '1234 ICouldGoForTacoBellRn Boulevard', 'Lorton', '08:00:00', '21:00:00', 'FULL SERVICE', '5711234567');
INSERT INTO `branch` VALUES ( 3, 'South Branch', '23320', '420 Hardstuck Lane', 'Chesapeake', '7:00:00', '18:00:00', 'FULL SERVICE', '7571234567');

--Bankers
INSERT INTO `banker` VALUES ( 1, 1, 'Soul Reaver Draven' );
INSERT INTO `banker` VALUES ( 2, 2, 'Dunk Master Darius' );
INSERT INTO `banker` VALUES ( 3, 3, 'Zamorak' );

--Users
INSERT INTO `users` VALUES ( 1, 'username', 'email@website.com', 'unhashed_password', null, 'John', 'Doe' );


--Appointments
INSERT INTO `appointment` VALUES (1, 2, 1, 3, '2021-05-20 12:00:00', 'General');
INSERT INTO `appointment` VALUES (2, 3, 1, 2, '2021-05-23 13:30:00', 'Loan Application');
INSERT INTO `appointment` VALUES (3, 1, 1, 1, '2021-05-26 15:00:00', 'Financial Advice');