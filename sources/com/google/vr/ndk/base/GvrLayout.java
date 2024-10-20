package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.InterfaceC0922Hc1;
import defpackage.U60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrLayout extends FrameLayout {
    private GvrApi gvrApi;
    private InterfaceC0922Hc1 impl;
    private GvrUiLayout uiLayout;

    public GvrLayout(Context context) {
        super(context);
        if (U60.a(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        init();
    }

    private void init() {
        TraceCompat.beginSection("GvrLayout.init");
        try {
            try {
                if (this.impl == null) {
                    this.impl = GvrLayoutFactory.create(getContext());
                }
                this.uiLayout = new GvrUiLayout(this.impl.getUiLayout());
                if (this.gvrApi == null) {
                    this.gvrApi = new GvrApi(getContext(), this.impl.getNativeGvrContext());
                }
                addView((View) ObjectWrapper.a(this.impl.getRootView(), View.class));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            TraceCompat.endSection();
        }
    }

    public GvrUiLayout getUiLayout() {
        return this.uiLayout;
    }

    public void onPause() {
        TraceCompat.beginSection("GvrLayout.onPause");
        try {
            try {
                this.impl.onPause();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            TraceCompat.endSection();
        }
    }

    public void onResume() {
        TraceCompat.beginSection("GvrLayout.onResume");
        try {
            try {
                this.impl.onResume();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            TraceCompat.endSection();
        }
    }

    public void shutdown() {
        TraceCompat.beginSection("GvrLayout.shutdown");
        try {
            try {
                this.impl.shutdown();
                this.gvrApi.shutdown();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            TraceCompat.endSection();
        }
    }

    public void setPresentationView(View view) {
        try {
            this.impl.setPresentationView(new ObjectWrapper(view));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean setAsyncReprojectionEnabled(boolean z) {
        if (!z) {
            if (this.gvrApi.getAsyncReprojectionEnabled()) {
                throw new UnsupportedOperationException("Async reprojection cannot be disabled once enabled.");
            }
            return true;
        }
        try {
            return this.impl.enableAsyncReprojection(0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean enableAsyncReprojectionProtected() {
        try {
            return this.impl.enableAsyncReprojection(1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        try {
            this.impl.setReentryIntent(new ObjectWrapper(pendingIntent));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
