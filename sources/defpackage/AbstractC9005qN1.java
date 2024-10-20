package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9005qN1 implements IBinder.DeathRecipient {
    public final C7975nN1 a = new C7975nN1(this);
    public HandlerC8319oN1 b;
    public BinderC9347rN1 c;

    public abstract void a(MediaMetadataCompat mediaMetadataCompat);

    public abstract void b(PlaybackStateCompat playbackStateCompat);

    public abstract void c();

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        d(8, null, null);
    }

    public final void e(Handler handler) {
        if (handler == null) {
            HandlerC8319oN1 handlerC8319oN1 = this.b;
            if (handlerC8319oN1 != null) {
                handlerC8319oN1.a = false;
                handlerC8319oN1.removeCallbacksAndMessages(null);
                this.b = null;
                return;
            }
            return;
        }
        HandlerC8319oN1 handlerC8319oN12 = new HandlerC8319oN1(this, handler.getLooper());
        this.b = handlerC8319oN12;
        handlerC8319oN12.a = true;
    }

    public final void d(int i, Object obj, Bundle bundle) {
        HandlerC8319oN1 handlerC8319oN1 = this.b;
        if (handlerC8319oN1 != null) {
            Message obtainMessage = handlerC8319oN1.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
