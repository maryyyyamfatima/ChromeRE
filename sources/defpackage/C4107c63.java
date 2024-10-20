package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4107c63 extends AbstractC11251wv {
    public final W53 i;
    public final Path j;

    public C4107c63(List list) {
        super(list);
        this.i = new W53();
        this.j = new Path();
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        W53 w53 = (W53) c12282zv1.b;
        W53 w532 = (W53) c12282zv1.c;
        W53 w533 = this.i;
        if (w533.b == null) {
            w533.b = new PointF();
        }
        w533.c = w53.c || w532.c;
        ArrayList arrayList = w53.a;
        int size = arrayList.size();
        int size2 = w532.a.size();
        ArrayList arrayList2 = w532.a;
        if (size != size2) {
            AbstractC5888hI1.a("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = w533.a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new C8051nc0());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = w53.b;
        PointF pointF2 = w532.b;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = CX1.a;
        float a = AbstractC2277Rn2.a(f3, f2, f, f2);
        float f4 = pointF.y;
        float a2 = AbstractC2277Rn2.a(pointF2.y, f4, f, f4);
        if (w533.b == null) {
            w533.b = new PointF();
        }
        w533.b.set(a, a2);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            C8051nc0 c8051nc0 = (C8051nc0) arrayList.get(size5);
            C8051nc0 c8051nc02 = (C8051nc0) arrayList2.get(size5);
            PointF pointF4 = c8051nc0.a;
            PointF pointF5 = c8051nc02.a;
            C8051nc0 c8051nc03 = (C8051nc0) arrayList3.get(size5);
            float f5 = pointF4.x;
            float a3 = AbstractC2277Rn2.a(pointF5.x, f5, f, f5);
            float f6 = pointF4.y;
            c8051nc03.a.set(a3, AbstractC2277Rn2.a(pointF5.y, f6, f, f6));
            C8051nc0 c8051nc04 = (C8051nc0) arrayList3.get(size5);
            PointF pointF6 = c8051nc0.b;
            float f7 = pointF6.x;
            PointF pointF7 = c8051nc02.b;
            float a4 = AbstractC2277Rn2.a(pointF7.x, f7, f, f7);
            float f8 = pointF6.y;
            c8051nc04.b.set(a4, AbstractC2277Rn2.a(pointF7.y, f8, f, f8));
            C8051nc0 c8051nc05 = (C8051nc0) arrayList3.get(size5);
            PointF pointF8 = c8051nc0.c;
            float f9 = pointF8.x;
            PointF pointF9 = c8051nc02.c;
            float a5 = AbstractC2277Rn2.a(pointF9.x, f9, f, f9);
            float f10 = pointF8.y;
            c8051nc05.c.set(a5, AbstractC2277Rn2.a(pointF9.y, f10, f, f10));
        }
        Path path = this.j;
        path.reset();
        PointF pointF10 = w533.b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = CX1.a;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i = 0; i < arrayList3.size(); i++) {
            C8051nc0 c8051nc06 = (C8051nc0) arrayList3.get(i);
            PointF pointF12 = c8051nc06.a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = c8051nc06.b;
            PointF pointF14 = c8051nc06.c;
            if (equals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (w533.c) {
            path.close();
        }
        return path;
    }
}
