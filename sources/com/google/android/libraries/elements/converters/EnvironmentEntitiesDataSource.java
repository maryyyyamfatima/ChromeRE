package com.google.android.libraries.elements.converters;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.converters.EnvironmentEntitiesDataSource;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import defpackage.AbstractC8868py0;
import defpackage.C3917ba2;
import defpackage.C4604da2;
import defpackage.C5422fw1;
import defpackage.C5979ha2;
import defpackage.C7217l92;
import defpackage.InterfaceC11303x40;
import defpackage.InterfaceC6416iq0;
import defpackage.Q82;
import defpackage.W92;
import defpackage.X82;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EnvironmentEntitiesDataSource extends EnvironmentDataSource {
    private final X82 sharedObservable;
    private final AtomicLong nextToken = new AtomicLong(1);
    private final Object disposableMapLock = new Object();
    private final LongSparseArray disposableMap = new LongSparseArray();
    private volatile byte[] environmentData = AbstractC8868py0.a;

    /* JADX WARN: Type inference failed for: r0v4, types: [zC0] */
    public EnvironmentEntitiesDataSource(X82 x82) {
        ?? r0 = new InterfaceC11303x40() { // from class: zC0
            @Override // defpackage.InterfaceC11303x40
            public final void accept(Object obj) {
                EnvironmentEntitiesDataSource.this.lambda$new$0((byte[]) obj);
            }
        };
        x82.getClass();
        C7217l92 c7217l92 = new C7217l92(x82, r0);
        Q82.b(1, "bufferSize");
        C3917ba2 c3917ba2 = new C3917ba2();
        AtomicReference atomicReference = new AtomicReference();
        this.sharedObservable = new W92(new C5979ha2(new C4604da2(atomicReference, c3917ba2), c7217l92, atomicReference, c3917ba2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(byte[] bArr) {
        this.environmentData = bArr;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public long subscribeToEnvironmentData(final EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0L;
        }
        long andIncrement = this.nextToken.getAndIncrement();
        synchronized (this.disposableMapLock) {
            LongSparseArray longSparseArray = this.disposableMap;
            X82 x82 = this.sharedObservable;
            InterfaceC11303x40 interfaceC11303x40 = new InterfaceC11303x40() { // from class: yC0
                @Override // defpackage.InterfaceC11303x40
                public final void accept(Object obj) {
                    EnvironmentDataObserver.this.environmentDataDidChange();
                }
            };
            x82.getClass();
            C5422fw1 c5422fw1 = new C5422fw1(interfaceC11303x40);
            x82.a(c5422fw1);
            longSparseArray.put(andIncrement, c5422fw1);
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.disposableMapLock) {
            InterfaceC6416iq0 interfaceC6416iq0 = (InterfaceC6416iq0) this.disposableMap.get(j);
            if (interfaceC6416iq0 != null) {
                interfaceC6416iq0.dispose();
            }
            this.disposableMap.remove(j);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public byte[] getEnvironmentData() {
        return this.environmentData;
    }
}
