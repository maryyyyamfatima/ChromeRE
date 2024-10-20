package defpackage;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.c;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zN1 */
/* loaded from: classes.dex */
public final class C12091zN1 {
    public final c a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public C12091zN1(Context context, C11768yR1 c11768yR1) {
        if (c11768yR1 == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = c11768yR1.a.b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new C9690sN1(context, mediaSessionCompat$Token);
        } else {
            this.a = new c(context, mediaSessionCompat$Token);
        }
    }

    public C12091zN1(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.a = new c(context, mediaSessionCompat$Token);
    }

    public final C11062wN1 b() {
        MediaController.TransportControls transportControls = this.a.a.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new C11748yN1(transportControls);
        }
        if (i >= 24) {
            return new C11405xN1(transportControls);
        }
        return new C11062wN1(transportControls);
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = this.a.a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.a(metadata);
        }
        return null;
    }

    public final void c(AbstractC9005qN1 abstractC9005qN1) {
        if (abstractC9005qN1 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.putIfAbsent(abstractC9005qN1, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        abstractC9005qN1.e(handler);
        c cVar = this.a;
        cVar.a.registerCallback(abstractC9005qN1.a, handler);
        synchronized (cVar.b) {
            if (cVar.e.a() != null) {
                BinderC9347rN1 binderC9347rN1 = new BinderC9347rN1(abstractC9005qN1);
                cVar.d.put(abstractC9005qN1, binderC9347rN1);
                abstractC9005qN1.c = binderC9347rN1;
                try {
                    cVar.e.a().K0(binderC9347rN1);
                    abstractC9005qN1.d(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                abstractC9005qN1.c = null;
                cVar.c.add(abstractC9005qN1);
            }
        }
    }

    public final void d(AbstractC9005qN1 abstractC9005qN1) {
        if (abstractC9005qN1 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.remove(abstractC9005qN1) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.b(abstractC9005qN1);
        } finally {
            abstractC9005qN1.e(null);
        }
    }
}
