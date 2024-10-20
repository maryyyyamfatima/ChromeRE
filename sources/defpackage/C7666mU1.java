package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mU1 */
/* loaded from: classes.dex */
public final class C7666mU1 implements InterfaceC2147Qn2, InterfaceC11990z41 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final C7322lU1 e;

    public C7666mU1(C7322lU1 c7322lU1) {
        c7322lU1.getClass();
        this.e = c7322lU1;
    }

    @Override // defpackage.InterfaceC11990z41
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Z40 z40 = (Z40) listIterator.previous();
            if (z40 instanceof InterfaceC2147Qn2) {
                this.d.add((InterfaceC2147Qn2) z40);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC2147Qn2) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        Path path = this.c;
        path.reset();
        C7322lU1 c7322lU1 = this.e;
        if (c7322lU1.b) {
            return path;
        }
        int b = AbstractC2373Sg3.b(c7322lU1.a);
        if (b == 0) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                path.addPath(((InterfaceC2147Qn2) arrayList.get(i)).h());
                i++;
            }
        } else if (b == 1) {
            a(Path.Op.UNION);
        } else if (b == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (b == 3) {
            a(Path.Op.INTERSECT);
        } else if (b == 4) {
            a(Path.Op.XOR);
        }
        return path;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC2147Qn2 interfaceC2147Qn2 = (InterfaceC2147Qn2) arrayList.get(size);
            if (interfaceC2147Qn2 instanceof C5817h50) {
                C5817h50 c5817h50 = (C5817h50) interfaceC2147Qn2;
                ArrayList arrayList2 = (ArrayList) c5817h50.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path h = ((InterfaceC2147Qn2) arrayList2.get(size2)).h();
                    C8704pV3 c8704pV3 = c5817h50.i;
                    if (c8704pV3 != null) {
                        matrix2 = c8704pV3.d();
                    } else {
                        matrix2 = c5817h50.a;
                        matrix2.reset();
                    }
                    h.transform(matrix2);
                    path.addPath(h);
                }
            } else {
                path.addPath(interfaceC2147Qn2.h());
            }
        }
        int i = 0;
        InterfaceC2147Qn2 interfaceC2147Qn22 = (InterfaceC2147Qn2) arrayList.get(0);
        if (interfaceC2147Qn22 instanceof C5817h50) {
            C5817h50 c5817h502 = (C5817h50) interfaceC2147Qn22;
            List e = c5817h502.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path h2 = ((InterfaceC2147Qn2) arrayList3.get(i)).h();
                C8704pV3 c8704pV32 = c5817h502.i;
                if (c8704pV32 != null) {
                    matrix = c8704pV32.d();
                } else {
                    matrix = c5817h502.a;
                    matrix.reset();
                }
                h2.transform(matrix);
                path2.addPath(h2);
                i++;
            }
        } else {
            path2.set(interfaceC2147Qn22.h());
        }
        this.c.op(path2, path, op);
    }
}
