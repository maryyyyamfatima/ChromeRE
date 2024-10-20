package defpackage;

import android.graphics.Point;
import android.view.Display;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2155Qp0 {
    public final Point a;
    public final boolean b;

    public C2155Qp0(Point point) {
        this.b = true;
        this.a = point;
    }

    public C2155Qp0(Display.Mode mode, boolean z) {
        if (mode == null) {
            throw new NullPointerException("Display.Mode == null, can't wrap a null reference");
        }
        this.b = z;
        this.a = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
    }
}
