package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9367rR1 implements InterfaceC9025qR1 {
    public final MediaSession a;
    public final MediaSessionCompat$Token b;
    public final Bundle d;
    public PlaybackStateCompat g;
    public MediaMetadataCompat h;
    public AbstractC8682pR1 i;
    public JR1 j;
    public final Object c = new Object();
    public boolean e = false;
    public final RemoteCallbackList f = new RemoteCallbackList();

    public AbstractC9367rR1(Context context, String str) {
        MediaSession a = a(context, str);
        this.a = a;
        this.b = new MediaSessionCompat$Token(a.getSessionToken(), new d((C9710sR1) this));
        this.d = null;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void c(AbstractC8682pR1 abstractC8682pR1, Handler handler) {
        synchronized (this.c) {
            this.i = abstractC8682pR1;
            this.a.setCallback(abstractC8682pR1 == null ? null : abstractC8682pR1.b, handler);
            if (abstractC8682pR1 != null) {
                abstractC8682pR1.j(this, handler);
            }
        }
    }

    @Override // defpackage.InterfaceC9025qR1
    public final PlaybackStateCompat d() {
        return this.g;
    }

    public final void h(PendingIntent pendingIntent) {
        this.a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // defpackage.InterfaceC9025qR1
    public void f(JR1 jr1) {
        synchronized (this.c) {
            this.j = jr1;
        }
    }

    public final String b() {
        MediaSession mediaSession = this.a;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC9025qR1
    public JR1 g() {
        JR1 jr1;
        synchronized (this.c) {
            jr1 = this.j;
        }
        return jr1;
    }

    @Override // defpackage.InterfaceC9025qR1
    public final AbstractC8682pR1 e() {
        AbstractC8682pR1 abstractC8682pR1;
        synchronized (this.c) {
            abstractC8682pR1 = this.i;
        }
        return abstractC8682pR1;
    }
}
