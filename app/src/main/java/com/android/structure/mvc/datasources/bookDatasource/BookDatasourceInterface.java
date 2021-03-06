package com.android.structure.mvc.datasources.bookDatasource;

import com.android.structure.mvc.models.Collection;
import com.android.structure.mvc.utils.asyncTask.DataCallback;
import com.android.structure.mvc.models.Book;

import java.util.List;

public interface BookDatasourceInterface {

    void getBookList(DataCallback<List<Book>> callback, String title, String collection, int limit);

    void getCollectionList(DataCallback<List<Collection>> callback);
}

