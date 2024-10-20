package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.util.SparseArray;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eP2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4892eP2 {
    public final int a;
    public final InterfaceC3862bP2 b;

    public abstract void a(int i);

    public abstract void c(int i);

    public AbstractC4892eP2(int i, InterfaceC3862bP2 interfaceC3862bP2) {
        this.a = i;
        this.b = interfaceC3862bP2;
    }

    public final void b(int i, IO2 io2) {
        InterfaceC3862bP2 interfaceC3862bP2 = this.b;
        if (interfaceC3862bP2 != null) {
            int i2 = this.a;
            ResourceManager resourceManager = (ResourceManager) interfaceC3862bP2;
            resourceManager.getClass();
            if (io2 == null) {
                return;
            }
            Bitmap b = io2.b();
            if (b == null) {
                if (io2.a()) {
                    long j = resourceManager.d;
                    if (j != 0) {
                        N.MxwZmAzJ(j, resourceManager, i2, i);
                        return;
                    }
                    return;
                }
                return;
            }
            SparseArray sparseArray = resourceManager.b;
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i2, sparseArray2);
            }
            sparseArray2.put(i, new C0642Ey1(resourceManager.c, io2));
            long j2 = resourceManager.d;
            if (j2 == 0) {
                return;
            }
            N.MM7E4tBk(j2, resourceManager, i2, i, b, io2.d().width(), io2.d().height(), io2.c());
        }
    }
}
