-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 22 fév. 2024 à 09:45
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_presence`
--

-- --------------------------------------------------------

--
-- Structure de la table `annee_accademique`
--

CREATE TABLE `annee_accademique` (
  `ID_Annee` int(11) NOT NULL,
  `Annee_Debut` int(11) NOT NULL,
  `Annee_Fin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `assiduite`
--

CREATE TABLE `assiduite` (
  `ID_Assiduite` int(11) NOT NULL,
  `Matricule` varchar(50) NOT NULL,
  `ID_UE` int(11) NOT NULL,
  `Date_Assiduite` datetime NOT NULL,
  `Présent` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE `enseignant` (
  `Nom_Enseignant` int(11) NOT NULL,
  `password` int(11) NOT NULL,
  `ID_UE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `matricule` varchar(50) NOT NULL,
  `Nom_Etudiant` varchar(50) NOT NULL,
  `Prenom_Etudiant` varchar(50) NOT NULL,
  `ID_Niveau` int(11) NOT NULL,
  `ID_Filiere` int(11) NOT NULL,
  `ID_Annee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `ID_Filiere` int(11) NOT NULL,
  `Nom_Filiere` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

CREATE TABLE `niveau` (
  `ID_Niveau` int(11) NOT NULL,
  `Nom_Niveau` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `semestre`
--

CREATE TABLE `semestre` (
  `ID_Semestre` int(11) NOT NULL,
  `Nom_Semestre` varchar(50) NOT NULL,
  `Date_Debut` date NOT NULL,
  `Date_Fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `ue`
--

CREATE TABLE `ue` (
  `ID_UE` int(11) NOT NULL,
  `Nom_UE` varchar(50) NOT NULL,
  `ID_Semestre` int(11) NOT NULL,
  `ID_Niveau` int(11) NOT NULL,
  `ID_Filiere` int(11) NOT NULL,
  `ID_Annee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `annee_accademique`
--
ALTER TABLE `annee_accademique`
  ADD PRIMARY KEY (`ID_Annee`);

--
-- Index pour la table `assiduite`
--
ALTER TABLE `assiduite`
  ADD KEY `ID_UE` (`ID_UE`),
  ADD KEY `Matricule` (`Matricule`);

--
-- Index pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD KEY `ID_UE` (`ID_UE`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`matricule`),
  ADD KEY `ID_Annee` (`ID_Annee`),
  ADD KEY `ID_Filiere` (`ID_Filiere`),
  ADD KEY `ID_Niveau` (`ID_Niveau`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`ID_Filiere`);

--
-- Index pour la table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`ID_Niveau`);

--
-- Index pour la table `semestre`
--
ALTER TABLE `semestre`
  ADD PRIMARY KEY (`ID_Semestre`);

--
-- Index pour la table `ue`
--
ALTER TABLE `ue`
  ADD PRIMARY KEY (`ID_UE`),
  ADD KEY `ID_Annee` (`ID_Annee`),
  ADD KEY `ID_Filiere` (`ID_Filiere`),
  ADD KEY `ID_Niveau` (`ID_Niveau`),
  ADD KEY `ID_Semestre` (`ID_Semestre`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `annee_accademique`
--
ALTER TABLE `annee_accademique`
  MODIFY `ID_Annee` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `filiere`
--
ALTER TABLE `filiere`
  MODIFY `ID_Filiere` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `niveau`
--
ALTER TABLE `niveau`
  MODIFY `ID_Niveau` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `semestre`
--
ALTER TABLE `semestre`
  MODIFY `ID_Semestre` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `ue`
--
ALTER TABLE `ue`
  MODIFY `ID_UE` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `assiduite`
--
ALTER TABLE `assiduite`
  ADD CONSTRAINT `assiduite_ibfk_1` FOREIGN KEY (`ID_UE`) REFERENCES `ue` (`ID_UE`),
  ADD CONSTRAINT `assiduite_ibfk_2` FOREIGN KEY (`Matricule`) REFERENCES `etudiant` (`matricule`);

--
-- Contraintes pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `enseignant_ibfk_1` FOREIGN KEY (`ID_UE`) REFERENCES `ue` (`ID_UE`);

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`ID_Annee`) REFERENCES `annee_accademique` (`ID_Annee`),
  ADD CONSTRAINT `etudiant_ibfk_2` FOREIGN KEY (`ID_Filiere`) REFERENCES `filiere` (`ID_Filiere`),
  ADD CONSTRAINT `etudiant_ibfk_3` FOREIGN KEY (`ID_Niveau`) REFERENCES `niveau` (`ID_Niveau`);

--
-- Contraintes pour la table `ue`
--
ALTER TABLE `ue`
  ADD CONSTRAINT `ue_ibfk_1` FOREIGN KEY (`ID_Annee`) REFERENCES `annee_accademique` (`ID_Annee`),
  ADD CONSTRAINT `ue_ibfk_2` FOREIGN KEY (`ID_Filiere`) REFERENCES `filiere` (`ID_Filiere`),
  ADD CONSTRAINT `ue_ibfk_3` FOREIGN KEY (`ID_Niveau`) REFERENCES `niveau` (`ID_Niveau`),
  ADD CONSTRAINT `ue_ibfk_4` FOREIGN KEY (`ID_Semestre`) REFERENCES `semestre` (`ID_Semestre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
