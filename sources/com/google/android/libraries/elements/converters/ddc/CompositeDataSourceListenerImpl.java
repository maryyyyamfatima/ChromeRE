package com.google.android.libraries.elements.converters.ddc;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CompositeDataSourceListenerImpl extends CompositeDataSourceListener {
    private final List listeners = new ArrayList();

    @Override // com.google.android.libraries.elements.converters.ddc.CompositeDataSourceListener
    public void addListener(DataSourceListener dataSourceListener) {
        this.listeners.add(dataSourceListener);
    }

    @Override // com.google.android.libraries.elements.converters.ddc.CompositeDataSourceListener
    public void clear() {
        this.listeners.clear();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public void onError(Status status) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onError(status);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public void onDataChanged() {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onDataChanged();
        }
    }
}
