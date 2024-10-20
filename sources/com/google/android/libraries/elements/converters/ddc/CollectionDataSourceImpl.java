package com.google.android.libraries.elements.converters.ddc;

import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.android.libraries.elements.interfaces.DataSourceListener;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.QP0;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CollectionDataSourceImpl extends CollectionDataSource {
    private final CompositeDataSourceListener compositeDataSourceListener;
    private final DataSourceDelegate dataSourceDelegate;
    private boolean isDisposed;
    private final boolean isDragAndDropEnabled;
    private final int itemsCountUntilEnd;
    private final QP0 onItemDroppedCommand;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:            if (((r5 == 0 || r8.b.get(r5 + r8.a) == 0) ? false : true) != false) goto L104;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollectionDataSourceImpl(defpackage.RP0 r3, defpackage.U80 r4, com.google.android.libraries.elements.interfaces.DataSourceDelegate r5, com.google.android.libraries.elements.converters.ddc.CompositeDataSourceListener r6, defpackage.C2202Qy2 r7, defpackage.C9183qt0 r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.dataSourceDelegate = r5
            r2.compositeDataSourceListener = r6
            r5 = 4
            r6 = 0
            if (r7 != 0) goto Ld
            r7 = -1
            goto L1e
        Ld:
            int r0 = r7.b(r5)
            if (r0 == 0) goto L1d
            java.nio.ByteBuffer r1 = r7.b
            int r7 = r7.a
            int r0 = r0 + r7
            int r7 = r1.getInt(r0)
            goto L1e
        L1d:
            r7 = r6
        L1e:
            r2.itemsCountUntilEnd = r7
            if (r8 == 0) goto L3a
            int r5 = r8.b(r5)
            r7 = 1
            if (r5 == 0) goto L36
            java.nio.ByteBuffer r0 = r8.b
            int r1 = r8.a
            int r5 = r5 + r1
            byte r5 = r0.get(r5)
            if (r5 == 0) goto L36
            r5 = r7
            goto L37
        L36:
            r5 = r6
        L37:
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r7 = r6
        L3b:
            r2.isDragAndDropEnabled = r7
            r5 = 0
            if (r8 == 0) goto L5d
            TF0 r7 = new TF0
            r7.<init>()
            r0 = 6
            int r0 = r8.b(r0)
            if (r0 == 0) goto L59
            int r5 = r8.a
            int r0 = r0 + r5
            int r5 = r8.a(r0)
            java.nio.ByteBuffer r8 = r8.b
            r7.c(r5, r8)
            r5 = r7
        L59:
            QP0 r5 = r3.o(r5, r4)
        L5d:
            r2.onItemDroppedCommand = r5
            r2.isDisposed = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.ddc.CollectionDataSourceImpl.<init>(RP0, U80, com.google.android.libraries.elements.interfaces.DataSourceDelegate, com.google.android.libraries.elements.converters.ddc.CompositeDataSourceListener, Qy2, qt0):void");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public Status loadMore() {
        return this.dataSourceDelegate.loadMore();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public ArrayList identifiers() {
        return this.dataSourceDelegate.identifiers();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public int size() {
        return this.dataSourceDelegate.size();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public StatusOr elementAtIndex(int i) {
        return this.dataSourceDelegate.elementAtIndex(i);
    }

    @Override // com.google.android.libraries.elements.interfaces.CollectionDataSource
    public void addListener(DataSourceListener dataSourceListener) {
        this.compositeDataSourceListener.addListener(dataSourceListener);
    }

    @Override // com.google.android.libraries.elements.interfaces.CollectionDataSource
    public int itemsCountUntilEnd() {
        return this.itemsCountUntilEnd;
    }

    @Override // com.google.android.libraries.elements.interfaces.CollectionDataSource
    public boolean isDragAndDropEnabled() {
        return this.isDragAndDropEnabled;
    }

    @Override // com.google.android.libraries.elements.interfaces.CollectionDataSource
    public CommandOuterClass$Command getOnItemDroppedCommand() {
        QP0 qp0 = this.onItemDroppedCommand;
        if (qp0 != null) {
            return qp0.a();
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public Status moveItem(int i, int i2) {
        return this.dataSourceDelegate.moveItem(i, i2);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public Status removeItem(int i) {
        return this.dataSourceDelegate.removeItem(i);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate, defpackage.InterfaceC6416iq0
    public void dispose() {
        this.isDisposed = true;
        this.compositeDataSourceListener.clear();
        this.dataSourceDelegate.dispose();
    }

    @Override // com.google.android.libraries.elements.interfaces.CollectionDataSource
    public boolean isDisposed() {
        return this.isDisposed;
    }
}
