package defpackage;

import android.database.Observable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pK2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8648pK2 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC8991qK2) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void d(Object obj, int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC8991qK2) ((Observable) this).mObservers.get(size)).c(obj, i, i2);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC8991qK2) ((Observable) this).mObservers.get(size)).d(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC8991qK2) ((Observable) this).mObservers.get(size)).f(i, i2);
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC8991qK2) ((Observable) this).mObservers.get(size)).e(i, i2);
        }
    }
}
