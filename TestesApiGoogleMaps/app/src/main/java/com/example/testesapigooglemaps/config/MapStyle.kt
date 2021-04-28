package com.example.testesapigooglemaps.config

class MapStyle {

    val standard = "[]"
    val silver = "[\n" +
            "        {\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f5f5f5\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.icon\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"visibility\": \"off\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#616161\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f5f5f5\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.land_parcel\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#bdbdbd\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#eeeeee\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#e5e5e5\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#9e9e9e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#ffffff\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.arterial\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dadada\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#616161\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.local\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#9e9e9e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.line\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#e5e5e5\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.station\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#eeeeee\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#c9c9c9\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#9e9e9e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]"
    val retro = "[\n" +
            "        {\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#ebe3cd\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#523735\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f5f1e6\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#c9b2a6\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.land_parcel\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dcd2be\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.land_parcel\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#ae9e90\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"landscape.natural\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dfd2ae\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dfd2ae\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#93817c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"geometry.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#a5b076\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#447530\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f5f1e6\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.arterial\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#fdfcf8\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f8c967\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#e9bc62\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway.controlled_access\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#e98d58\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway.controlled_access\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#db8555\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.local\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#806b63\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.line\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dfd2ae\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.line\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#8f7d77\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.line\",\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#ebe3cd\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.station\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#dfd2ae\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"geometry.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#b9d3c2\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#92998d\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]"
    val dark = "[\n" +
            "        {\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#212121\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.icon\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"visibility\": \"off\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#212121\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.country\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#9e9e9e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.land_parcel\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"visibility\": \"off\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.locality\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#bdbdbd\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#181818\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#616161\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#1b1b1b\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"geometry.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#2c2c2c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#8a8a8a\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.arterial\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#373737\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#3c3c3c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway.controlled_access\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#4e4e4e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.local\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#616161\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#757575\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#000000\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#3d3d3d\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]"
    val night = "[\n" +
            "        {\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#242f3e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#746855\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#242f3e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"administrative.locality\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#d59563\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#d59563\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#263c3f\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"poi.park\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#6b9a76\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#38414e\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#212a37\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#9ca5b3\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#746855\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"geometry.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#1f2835\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"road.highway\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#f3d19c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#2f3948\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"transit.station\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#d59563\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"geometry\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#17263c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"labels.text.fill\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#515c6d\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        {\n" +
            "          \"featureType\": \"water\",\n" +
            "          \"elementType\": \"labels.text.stroke\",\n" +
            "          \"stylers\": [\n" +
            "            {\n" +
            "              \"color\": \"#17263c\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]"
    val aubergine = "[\n" +
            "          {\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#1d2c4d\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#8ec3b9\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"elementType\": \"labels.text.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#1a3646\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"administrative.country\",\n" +
            "            \"elementType\": \"geometry.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#4b6878\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"administrative.land_parcel\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#64779e\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"administrative.province\",\n" +
            "            \"elementType\": \"geometry.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#4b6878\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"landscape.man_made\",\n" +
            "            \"elementType\": \"geometry.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#334e87\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"landscape.natural\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#023e58\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"poi\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#283d6a\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"poi\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#6f9ba5\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"poi\",\n" +
            "            \"elementType\": \"labels.text.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#1d2c4d\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"poi.park\",\n" +
            "            \"elementType\": \"geometry.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#023e58\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"poi.park\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#3C7680\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#304a7d\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#98a5be\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road\",\n" +
            "            \"elementType\": \"labels.text.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#1d2c4d\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road.highway\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#2c6675\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road.highway\",\n" +
            "            \"elementType\": \"geometry.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#255763\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road.highway\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#b0d5ce\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"road.highway\",\n" +
            "            \"elementType\": \"labels.text.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#023e58\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"transit\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#98a5be\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"transit\",\n" +
            "            \"elementType\": \"labels.text.stroke\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#1d2c4d\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"transit.line\",\n" +
            "            \"elementType\": \"geometry.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#283d6a\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"transit.station\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#3a4762\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"water\",\n" +
            "            \"elementType\": \"geometry\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#0e1626\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"featureType\": \"water\",\n" +
            "            \"elementType\": \"labels.text.fill\",\n" +
            "            \"stylers\": [\n" +
            "              {\n" +
            "                \"color\": \"#4e6d70\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ]"
}