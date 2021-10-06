package org.wit.placemark.console.main

import mu.KotlinLogging
import org.wit.placemark.console.controllers.PlacemarkController



private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    PlacemarkController().start()
}