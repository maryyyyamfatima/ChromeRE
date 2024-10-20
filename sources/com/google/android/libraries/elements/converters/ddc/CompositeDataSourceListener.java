package com.google.android.libraries.elements.converters.ddc;

import com.google.android.libraries.elements.interfaces.DataSourceListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
abstract class CompositeDataSourceListener extends DataSourceListener {
    public abstract void addListener(DataSourceListener dataSourceListener);

    public abstract void clear();
}
