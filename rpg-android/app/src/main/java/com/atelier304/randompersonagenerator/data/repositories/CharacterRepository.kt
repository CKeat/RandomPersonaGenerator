package com.atelier304.randompersonagenerator.data.repositories

import com.atelier304.randompersonagenerator.data.dragonage.entities.NPCharacter

interface CharacterRepository {
    fun generateCharacter(artistId: String?, artistName: String?): List<NPCharacter>
    fun getcharacterById(id: String): NPCharacter?
}