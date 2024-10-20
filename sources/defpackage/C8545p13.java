package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8545p13 {
    public final ArrayList a;
    public final int b;
    public int c;
    public boolean d;
    public String e;

    public C8545p13(int i) {
        this(i, 0, null);
    }

    public C8545p13(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = true;
        this.b = i;
        arrayList.clear();
        if (list == null || list.isEmpty()) {
            this.c = -1;
        } else {
            this.c = i2;
            arrayList.addAll(list);
        }
    }

    public final int d() {
        return this.a.size();
    }

    public final C4733dw0 b(int i) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (C4733dw0) arrayList.get(i);
    }

    public final void e(C4733dw0 c4733dw0) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == c4733dw0) {
                this.c = i;
                return;
            }
            i++;
        }
    }

    public final C4733dw0 c() {
        return b(this.c);
    }

    public final void a(C4733dw0 c4733dw0) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.a;
            if (i >= arrayList.size() || TextUtils.equals(((C4733dw0) arrayList.get(i)).l, c4733dw0.l)) {
                break;
            } else {
                i++;
            }
        }
        if (i < arrayList.size()) {
            arrayList.set(i, c4733dw0);
            if (this.c != i || c4733dw0.d()) {
                return;
            }
            this.c = -1;
            return;
        }
        arrayList.add(0, c4733dw0);
        if (c4733dw0.d()) {
            this.c = 0;
        } else {
            this.c = -1;
        }
    }
}
