package org.chromium.ui.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.SparseArray;
import defpackage.AbstractC4892eP2;
import defpackage.C1224Jk3;
import defpackage.C1404Ku3;
import defpackage.C9537rv0;
import defpackage.InterfaceC3862bP2;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ResourceManager implements InterfaceC3862bP2 {
    public final SparseArray a;
    public final SparseArray b;
    public final float c;
    public long d;

    public ResourceManager(Resources resources, int i, long j) {
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        this.b = new SparseArray();
        this.c = 1.0f / resources.getDisplayMetrics().density;
        sparseArray.put(0, new C1224Jk3(this, resources));
        sparseArray.put(1, new C9537rv0(1, this));
        sparseArray.put(2, new C9537rv0(2, this));
        sparseArray.put(3, new C1404Ku3(this, i));
        this.d = j;
    }

    public final C9537rv0 a() {
        return (C9537rv0) this.a.get(1);
    }

    public final void destroy() {
        this.d = 0L;
    }

    public final void resourceRequested(int i, int i2) {
        AbstractC4892eP2 abstractC4892eP2 = (AbstractC4892eP2) this.a.get(i);
        if (abstractC4892eP2 != null) {
            abstractC4892eP2.a(i2);
        }
    }

    public final void preloadResource(int i, int i2) {
        AbstractC4892eP2 abstractC4892eP2 = (AbstractC4892eP2) this.a.get(i);
        if (abstractC4892eP2 != null) {
            abstractC4892eP2.c(i2);
        }
    }

    public final long getNativePtr() {
        return this.d;
    }

    public static ResourceManager create(WindowAndroid windowAndroid, long j) {
        Context context = (Context) windowAndroid.j.get();
        if (context == null) {
            throw new IllegalStateException("Context should not be null during initialization.");
        }
        Point point = windowAndroid.i.c;
        return new ResourceManager(context.getResources(), Math.min(point.x, point.y), j);
    }
}
