package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oR1 */
/* loaded from: classes.dex */
public final class C8339oR1 extends MediaSession.Callback {
    public final /* synthetic */ AbstractC8682pR1 a;

    public C8339oR1(AbstractC8682pR1 abstractC8682pR1) {
        this.a = abstractC8682pR1;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        H84 h84;
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a.b;
                b a2 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a2 == null ? null : a2.asBinder());
                synchronized (mediaSessionCompat$Token.a) {
                    h84 = mediaSessionCompat$Token.i;
                }
                if (h84 == null) {
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(h84));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                AbstractC8682pR1 abstractC8682pR1 = this.a;
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                AbstractC8682pR1 abstractC8682pR12 = this.a;
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                abstractC8682pR12.getClass();
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                AbstractC8682pR1 abstractC8682pR13 = this.a;
                abstractC8682pR13.getClass();
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.a.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return false;
        }
        b(a);
        boolean c = this.a.c(intent);
        a.f(null);
        return c || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.e();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.d();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.h();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.i();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.b();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.f();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.g(j);
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        RatingCompat.a(rating);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            AbstractC8682pR1 abstractC8682pR1 = this.a;
            if (equals) {
                C11768yR1.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                C11768yR1.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                C11768yR1.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                C11768yR1.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                C11768yR1.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC8682pR1.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                abstractC8682pR1.getClass();
            } else {
                abstractC8682pR1.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        C11768yR1.a(bundle);
        b(a);
        this.a.getClass();
        a.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        AbstractC9367rR1 a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.getClass();
        a.f(null);
    }

    public static void b(AbstractC9367rR1 abstractC9367rR1) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        String b = abstractC9367rR1.b();
        if (TextUtils.isEmpty(b)) {
            b = "android.media.session.MediaController";
        }
        abstractC9367rR1.f(new JR1(-1, -1, b));
    }

    public final AbstractC9367rR1 a() {
        AbstractC9367rR1 abstractC9367rR1;
        synchronized (this.a.a) {
            abstractC9367rR1 = (AbstractC9367rR1) this.a.d.get();
        }
        if (abstractC9367rR1 == null || this.a != abstractC9367rR1.e()) {
            return null;
        }
        return abstractC9367rR1;
    }
}
