package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import defpackage.AK2;
import defpackage.AbstractC8305oK2;
import defpackage.Ec4;
import defpackage.M41;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class d {
    public static final List y = Collections.emptyList();
    public final View a;
    public WeakReference g;
    public int o;
    public RecyclerView w;
    public AbstractC8305oK2 x;
    public int h = -1;
    public int i = -1;
    public long j = -1;
    public int k = -1;
    public int l = -1;
    public d m = null;
    public d n = null;
    public ArrayList p = null;
    public List q = null;
    public int r = 0;
    public b s = null;
    public boolean t = false;
    public int u = 0;
    public int v = -1;

    public d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void q(int i, boolean z) {
        if (this.i == -1) {
            this.i = this.h;
        }
        if (this.l == -1) {
            this.l = this.h;
        }
        if (z) {
            this.l += i;
        }
        this.h += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((AK2) view.getLayoutParams()).h = true;
        }
    }

    public final boolean t() {
        return (this.o & 128) != 0;
    }

    public final int h() {
        int i = this.l;
        return i == -1 ? this.h : i;
    }

    public final int g() {
        RecyclerView recyclerView;
        AbstractC8305oK2 abstractC8305oK2;
        int H;
        if (this.x == null || (recyclerView = this.w) == null || (abstractC8305oK2 = recyclerView.r) == null || (H = recyclerView.H(this)) == -1 || this.x != abstractC8305oK2) {
            return -1;
        }
        return H;
    }

    public final int f() {
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.H(this);
    }

    public final boolean o() {
        return this.s != null;
    }

    public final boolean u() {
        return (this.o & 32) != 0;
    }

    public final boolean l() {
        return (this.o & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return (this.o & 1) != 0;
    }

    public final boolean n() {
        return (this.o & 8) != 0;
    }

    public final boolean p() {
        return (this.o & 256) != 0;
    }

    public final boolean j() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.w) ? false : true;
    }

    public final void d(int i) {
        this.o = i | this.o;
    }

    public final void c(Object obj) {
        if (obj == null) {
            d(1024);
            return;
        }
        if ((1024 & this.o) == 0) {
            if (this.p == null) {
                ArrayList arrayList = new ArrayList();
                this.p = arrayList;
                this.q = Collections.unmodifiableList(arrayList);
            }
            this.p.add(obj);
        }
    }

    public final List i() {
        ArrayList arrayList;
        return ((this.o & 1024) != 0 || (arrayList = this.p) == null || arrayList.size() == 0) ? y : this.q;
    }

    public final void r() {
        this.o = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1L;
        this.l = -1;
        this.r = 0;
        this.m = null;
        this.n = null;
        ArrayList arrayList = this.p;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.o &= -1025;
        this.u = 0;
        this.v = -1;
        RecyclerView.k(this);
    }

    public final String toString() {
        StringBuilder a = M41.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        a.append(Integer.toHexString(hashCode()));
        a.append(" position=");
        a.append(this.h);
        a.append(" id=");
        a.append(this.j);
        a.append(", oldPos=");
        a.append(this.i);
        a.append(", pLpos:");
        a.append(this.l);
        StringBuilder sb = new StringBuilder(a.toString());
        if (o()) {
            sb.append(" scrap ");
            sb.append(this.t ? "[changeScrap]" : "[attachedScrap]");
        }
        if (l()) {
            sb.append(" invalid");
        }
        if (!k()) {
            sb.append(" unbound");
        }
        boolean z = true;
        if ((this.o & 2) != 0) {
            sb.append(" update");
        }
        if (n()) {
            sb.append(" removed");
        }
        if (t()) {
            sb.append(" ignored");
        }
        if (p()) {
            sb.append(" tmpDetached");
        }
        if (!m()) {
            sb.append(" not recyclable(" + this.r + ")");
        }
        if ((this.o & 512) == 0 && !l()) {
            z = false;
        }
        if (z) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void s(boolean z) {
        int i = this.r;
        int i2 = z ? i - 1 : i + 1;
        this.r = i2;
        if (i2 < 0) {
            this.r = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.o |= 16;
        } else if (z && i2 == 0) {
            this.o &= -17;
        }
    }

    public final boolean m() {
        if ((this.o & 16) == 0) {
            WeakHashMap weakHashMap = Ec4.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }
}
