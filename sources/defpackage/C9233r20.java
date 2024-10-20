package defpackage;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9233r20 {
    public final SurfaceView a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public ViewGroup g;

    public C9233r20(Context context, int i, SurfaceHolder.Callback2 callback2) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.a = surfaceView;
        if (i == -3) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        surfaceView.setVisibility(4);
        b().setFormat(i);
        b().addCallback(callback2);
        this.d = 0;
    }

    public final SurfaceHolder b() {
        return this.a.getHolder();
    }

    public final boolean a() {
        return this.g != null;
    }
}
