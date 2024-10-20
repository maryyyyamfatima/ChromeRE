package defpackage;

import J.N;
import android.hardware.display.DisplayManager;
import android.util.SparseArray;
import android.view.Display;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2025Pp0 implements DisplayManager.DisplayListener {
    public final /* synthetic */ DisplayAndroidManager a;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C5067eu2 c5067eu2 = (C5067eu2) this.a.c.get(i);
        Display display = ((DisplayManager) V60.a.getSystemService("display")).getDisplay(i);
        if (c5067eu2 == null || display == null) {
            return;
        }
        c5067eu2.g(display);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        DisplayAndroidManager displayAndroidManager = this.a;
        if (i == displayAndroidManager.b) {
            return;
        }
        SparseArray sparseArray = displayAndroidManager.c;
        C5067eu2 c5067eu2 = (C5067eu2) sparseArray.get(i);
        if (c5067eu2 == null) {
            return;
        }
        if (C5067eu2.p) {
            c5067eu2.n.unregisterComponentCallbacks(c5067eu2.o);
        }
        long j = displayAndroidManager.a;
        if (j != 0) {
            N.MyzQIqd_(j, displayAndroidManager, i);
        }
        sparseArray.remove(i);
    }

    public C2025Pp0(DisplayAndroidManager displayAndroidManager) {
        this.a = displayAndroidManager;
    }
}
