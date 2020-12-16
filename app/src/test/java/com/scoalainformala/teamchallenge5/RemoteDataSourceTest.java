package com.scoalainformala.teamchallenge5;

import com.scoalainformala.teamchallenge5.data.RemoteDataSource;
import com.scoalainformala.teamchallenge5.data.WordApi;
import com.scoalainformala.teamchallenge5.data.WordDto;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoteDataSourceTest {

    @Test
    public void when_getItemsInvoked_returnsCorrectResult() {
        RemoteDataSource source = new RemoteDataSource(WordApi.createApi());
        List<WordDto> items = source.getItems();

        assertEquals(7, items.size());

        WordDto item = items.get(0);

        assertEquals("biblioklept", item.getName());
        assertEquals("one who steals books", item.getDefinition());
    }
}
