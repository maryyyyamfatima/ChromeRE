package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import defpackage.InterfaceC6416iq0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CollectionDataSource extends DataSourceDelegate implements InterfaceC6416iq0 {
    public abstract void addListener(DataSourceListener dataSourceListener);

    public abstract CommandOuterClass$Command getOnItemDroppedCommand();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract boolean isDragAndDropEnabled();

    public abstract int itemsCountUntilEnd();
}
