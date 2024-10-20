package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3965bi2 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void d(ViewGroup viewGroup, Object obj);

    public void e() {
    }

    public abstract int f();

    public int g(Object obj) {
        return -1;
    }

    public abstract Object h(int i, ViewGroup viewGroup);

    public abstract boolean i(View view, Object obj);

    public void k() {
    }

    public void l() {
    }

    public void m(Object obj) {
    }

    public void n(ViewGroup viewGroup) {
    }

    public final void j() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }
}
