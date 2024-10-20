package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1281Jw0 {
    public boolean A;
    public final int a;
    public List b;
    public List c;
    public List d;
    public HashMap e;
    public HashMap f;
    public HashSet g;
    public ArrayList h;
    public TextWatcher i;
    public InterfaceC1151Iw0 j;
    public C6220iG k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public Callback u;
    public Runnable v;
    public int w;
    public int x;
    public int y;
    public boolean z = true;
    public int B = 0;

    public static C1281Jw0 a(String str, ArrayList arrayList, String str2) {
        C1281Jw0 c1281Jw0 = new C1281Jw0(10);
        c1281Jw0.p = str;
        c1281Jw0.t = str2;
        c1281Jw0.e(arrayList);
        return c1281Jw0;
    }

    public static C1281Jw0 b() {
        return new C1281Jw0(0);
    }

    public static C1281Jw0 c(int i, String str, HashSet hashSet, C2827Vt2 c2827Vt2, InterfaceC1151Iw0 interfaceC1151Iw0, C6220iG c6220iG, String str2, String str3, String str4) {
        C1281Jw0 c1281Jw0 = new C1281Jw0(i);
        c1281Jw0.h = hashSet == null ? null : new ArrayList(hashSet);
        c1281Jw0.i = c2827Vt2;
        c1281Jw0.j = interfaceC1151Iw0;
        c1281Jw0.k = c6220iG;
        c1281Jw0.m = str3;
        c1281Jw0.l = str2;
        c1281Jw0.p = str;
        c1281Jw0.s = str4;
        c1281Jw0.B = Math.max(0, 0);
        return c1281Jw0;
    }

    public C1281Jw0(int i) {
        this.a = i;
    }

    public final void e(List list) {
        this.d = list;
        this.g = new HashSet();
        this.e = new HashMap();
        this.f = new HashMap();
        for (int i = 0; i < this.d.size(); i++) {
            this.g.add((String) ((Pair) ((C1021Hw0) this.d.get(i))).first);
            this.f.put(((CharSequence) ((Pair) ((C1021Hw0) this.d.get(i))).second).toString(), (String) ((Pair) ((C1021Hw0) this.d.get(i))).first);
            this.e.put((String) ((Pair) ((C1021Hw0) this.d.get(i))).first, (CharSequence) ((Pair) ((C1021Hw0) this.d.get(i))).second);
        }
    }

    public final boolean d() {
        if (TextUtils.isEmpty(this.n)) {
            if ((!TextUtils.isEmpty(this.l)) && (TextUtils.isEmpty(this.s) || TextUtils.getTrimmedLength(this.s) == 0)) {
                this.o = this.l;
                return false;
            }
            InterfaceC1151Iw0 interfaceC1151Iw0 = this.j;
            if (interfaceC1151Iw0 != null && !interfaceC1151Iw0.isValid(this.s)) {
                this.o = this.m;
                return false;
            }
            this.o = null;
            return true;
        }
        this.o = this.n;
        return false;
    }
}
