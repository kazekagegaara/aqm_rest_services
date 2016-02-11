--
-- Database: `aspira`
--

-- --------------------------------------------------------

--
-- Table structure for table `aqmreadings`
--

DROP TABLE IF EXISTS `aqmreadings`;
CREATE TABLE IF NOT EXISTS `aqmreadings` (
  `id` int(11) DEFAULT NULL,
  `largeValue` varchar(255) DEFAULT NULL,
  `smallValue` varchar(255) DEFAULT NULL,
  `synced` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  `date_field` timestamp NULL DEFAULT NULL,
  `geo_latitude` decimal(10,5) DEFAULT NULL,
  `geo_longitude` decimal(10,5) DEFAULT NULL,
  `geo_method` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
CREATE TABLE IF NOT EXISTS `logs` (
  `id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `synced` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `extras` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
);

-- --------------------------------------------------------

--
-- Table structure for table `sprioreading`
--

DROP TABLE IF EXISTS `sprioreading`;
CREATE TABLE IF NOT EXISTS `sprioreading` (
  `id` int(11) DEFAULT NULL,
  `reading` varchar(255) DEFAULT NULL,
  `synced` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `time_of_day` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
);