package com.scoalainformala.teamchallenge5;

import com.scoalainformala.teamchallenge5.data.InMemoryDataSource;
import com.scoalainformala.teamchallenge5.data.WordDto;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InMemoryDataSourceTest {

    @Test
    public void when_getItemsInvoked_returnsCorrectResult() {
        InMemoryDataSource source = new InMemoryDataSource();
        List<WordDto> items = source.getWords();

        assertEquals(2, items.size());

        WordDto item1 = items.get(0);
        WordDto item2 = items.get(1);

        assertEquals("Negru", item1.getName());
        assertEquals("Galben", item2.getName());
        assertEquals("Def1", item1.getDefinition());
        assertEquals("Def2", item2.getDefinition());
    }

    @Test
    public void when_addInvoked_returnsCorrectResult() {
        InMemoryDataSource source = new InMemoryDataSource();

        WordDto word1 = new WordDto("Verde", "Def3");
        WordDto word2 = new WordDto("Rosu", "Def4");

        source.addWord(word1);
        source.addWord(word2);

        List<WordDto> items = source.getWords();

        assertEquals(4, items.size());
        assertEquals("Verde", items.get(2).getName());
        assertEquals("Rosu", items.get(3).getName());
        assertEquals("Def3", items.get(2).getDefinition());
        assertEquals("Def4", items.get(3).getDefinition());
    }
}
