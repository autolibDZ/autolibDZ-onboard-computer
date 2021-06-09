package com.sil1.autolibdz_onboard_computer.data.model

data class Vehicule(var numChassis: Int,
                    var numImmatriculation: Int,
                    var modele: String,
                    var marque: String,
                    var couleur: String,
                    var etat: String,
                    var tempsDeRefroidissement: Int,
                    var pressionHuileMoteur: Int,
                    var chargeBatterie: Int,
                    var anomalieCircuit: String,
                    var pressionPneus: Int,
                    var niveauMinimumHuile: Int,
                    var regulateurVitesse: Int,
                    var limiteurVitesse: Int,
                    var idAgentMaintenance: Int,
                    var idBorne: Int,
                    var idCloudinary: String,
                    var secureUrl: String,
                    var id: Int)