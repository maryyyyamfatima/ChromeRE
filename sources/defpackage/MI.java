package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MI {
    public final ArrayList a = new ArrayList();
    public Y03 b;
    public LI c;
    public int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(AI ai) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.a.add(ai);
        int i11 = ai.a;
        int i12 = 0;
        int i13 = 1;
        int i14 = ai.d;
        if (i11 != -3) {
            i = -1;
            if (i11 == -1) {
                i = i14;
            } else if (i11 == 1) {
                i = 1;
            } else if (i11 != 3) {
                i = 0;
            }
        } else {
            i = -i14;
        }
        this.d += i;
        LI li = this.c;
        if (li != null) {
            switch (i11) {
                case -3:
                    i3 = i14 + 0;
                    i2 = 0;
                    i4 = 0;
                    i5 = 0;
                    i10 = i5;
                    i7 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
                case -2:
                    i6 = i14 + 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i7 = 0;
                    i8 = 0;
                    break;
                case -1:
                    i2 = i14 + 0;
                    i13 = 0;
                    i9 = 0;
                    i5 = i13;
                    i4 = i9;
                    i3 = 0;
                    i10 = i5;
                    i7 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
                case 0:
                    i8 = i14 + 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i7 = 0;
                    i6 = 0;
                    break;
                case 1:
                    i2 = 0;
                    i9 = 0;
                    i5 = i13;
                    i4 = i9;
                    i3 = 0;
                    i10 = i5;
                    i7 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
                case 2:
                    i2 = 0;
                    i3 = 0;
                    i10 = 0;
                    i7 = 1;
                    i4 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = 0;
                    i9 = 1;
                    i13 = 0;
                    i5 = i13;
                    i4 = i9;
                    i3 = 0;
                    i10 = i5;
                    i7 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
                default:
                    i13 = 0;
                    i2 = 0;
                    i9 = 0;
                    i5 = i13;
                    i4 = i9;
                    i3 = 0;
                    i10 = i5;
                    i7 = 0;
                    i8 = 0;
                    i12 = i10;
                    i6 = 0;
                    break;
            }
            this.c = new LI(li.a + i, li.b + i12, li.c + i2, li.d + i4, li.e + i3, li.f + i7, li.g + i6, i8 + li.h);
        }
    }

    public static MI c(MI mi, MI mi2) {
        MI a = a(0, null, false);
        int i = mi != null ? mi.d : 0;
        int i2 = mi2 != null ? mi2.d : 0;
        ArrayList arrayList = a.a;
        LI li = mi != null ? mi.c : null;
        LI li2 = mi2 != null ? mi2.c : null;
        if (mi != null) {
            Iterator it = mi.a.iterator();
            while (it.hasNext()) {
                AI ai = (AI) it.next();
                arrayList.add(AI.a(ai.a, ai.b, ai.c, ai.d, ai.e, ai.f, ai.g, ai.h));
            }
        }
        if (mi2 != null) {
            Iterator it2 = mi2.a.iterator();
            while (it2.hasNext()) {
                AI ai2 = (AI) it2.next();
                int i3 = ai2.c;
                arrayList.add(AI.a(ai2.a, ai2.b + i, i3 >= 0 ? i3 + i : -1, ai2.d, ai2.e, ai2.f, ai2.g, ai2.h));
            }
        }
        a.d = i + i2;
        if (li == null) {
            li = li2;
        } else if (li2 != null) {
            li = new LI(li.a + li2.a, li.b + li2.b, li.c + li2.c, li.d + li2.d, li.e + li2.e, li.f + li2.f, li.g + li2.g, li2.h + li.h);
        }
        a.c = li;
        return a;
    }

    public static List e(ArrayList arrayList, C5277fX3 c5277fX3) {
        if (c5277fX3 == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(new C5621gX3((InterfaceC7976nN2) arrayList.get(i), c5277fX3));
        }
        return arrayList2;
    }

    public static MI a(int i, Y03 y03, boolean z) {
        MI mi = new MI();
        mi.d = i;
        mi.b = y03;
        mi.c = z ? new LI() : null;
        return mi;
    }

    public final void d() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AI ai = (AI) it.next();
            ai.e = null;
            ai.f = null;
            ai.g = null;
            ai.h = null;
        }
        arrayList.clear();
        this.c = null;
        this.d = 0;
    }
}
