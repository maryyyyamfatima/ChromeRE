package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XG3 {
    public final LineBoxParcel[] a;
    public Point[] b;
    public Rect c;

    public XG3(SparseArray sparseArray) {
        this.a = new LineBoxParcel[sparseArray.size()];
        int i = 0;
        while (true) {
            LineBoxParcel[] lineBoxParcelArr = this.a;
            if (i >= lineBoxParcelArr.length) {
                return;
            }
            lineBoxParcelArr[i] = (LineBoxParcel) sparseArray.valueAt(i);
            i++;
        }
    }

    public final Point[] a() {
        XG3 xg3;
        if (this.b == null) {
            LineBoxParcel[] lineBoxParcelArr = this.a;
            char c = 0;
            if (lineBoxParcelArr.length == 0) {
                this.b = new Point[0];
            } else {
                int i = Integer.MIN_VALUE;
                int i2 = 0;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MAX_VALUE;
                int i5 = Integer.MIN_VALUE;
                while (i2 < lineBoxParcelArr.length) {
                    BoundingBoxParcel boundingBoxParcel = lineBoxParcelArr[i2].g;
                    BoundingBoxParcel boundingBoxParcel2 = lineBoxParcelArr[c].g;
                    int i6 = -boundingBoxParcel2.a;
                    int i7 = -boundingBoxParcel2.g;
                    double d = boundingBoxParcel2.j;
                    double sin = Math.sin(Math.toRadians(d));
                    double cos = Math.cos(Math.toRadians(d));
                    Point[] pointArr = new Point[4];
                    Point point = new Point(boundingBoxParcel.a, boundingBoxParcel.g);
                    pointArr[c] = point;
                    point.offset(i6, i7);
                    Point point2 = pointArr[c];
                    int i8 = point2.x;
                    int i9 = i5;
                    double d2 = point2.y;
                    int i10 = (int) ((d2 * sin) + (i8 * cos));
                    int i11 = (int) ((d2 * cos) + ((-i8) * sin));
                    point2.x = i10;
                    point2.y = i11;
                    int i12 = boundingBoxParcel.h + i10;
                    pointArr[1] = new Point(i12, i11);
                    int i13 = i11 + boundingBoxParcel.i;
                    pointArr[2] = new Point(i12, i13);
                    pointArr[3] = new Point(i10, i13);
                    i5 = i9;
                    for (int i14 = 0; i14 < 4; i14++) {
                        Point point3 = pointArr[i14];
                        i3 = Math.min(i3, point3.x);
                        i5 = Math.max(i5, point3.x);
                        i4 = Math.min(i4, point3.y);
                        i = Math.max(i, point3.y);
                    }
                    i2++;
                    c = 0;
                }
                int i15 = i5;
                BoundingBoxParcel boundingBoxParcel3 = lineBoxParcelArr[c].g;
                int i16 = boundingBoxParcel3.a;
                double d3 = boundingBoxParcel3.j;
                double sin2 = Math.sin(Math.toRadians(d3));
                double cos2 = Math.cos(Math.toRadians(d3));
                int i17 = 0;
                Point[] pointArr2 = {new Point(i3, i4), new Point(i15, i4), new Point(i15, i), new Point(i3, i)};
                while (i17 < 4) {
                    Point point4 = pointArr2[i17];
                    double d4 = point4.x;
                    double d5 = cos2;
                    double d6 = point4.y;
                    point4.x = (int) ((d4 * cos2) - (d6 * sin2));
                    point4.y = (int) ((d6 * d5) + (d4 * sin2));
                    point4.offset(i16, boundingBoxParcel3.g);
                    i17++;
                    cos2 = d5;
                }
                xg3 = this;
                xg3.b = pointArr2;
                return xg3.b;
            }
        }
        xg3 = this;
        return xg3.b;
    }
}
