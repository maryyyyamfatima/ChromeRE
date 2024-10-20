package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import defpackage.InterfaceC12174zd1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void B(String str, Bundle bundle);

    void E();

    void E0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void F0();

    void I0(int i);

    void J(int i, int i2);

    void J0();

    CharSequence K();

    void K0(InterfaceC12174zd1 interfaceC12174zd1);

    void M(String str, Bundle bundle);

    void N0();

    Bundle O();

    void P0(long j);

    void Q(String str, Bundle bundle);

    ParcelableVolumeInfo Q0();

    void S(String str, Bundle bundle);

    void U(int i, int i2);

    void U0(int i);

    void V();

    void W(Uri uri, Bundle bundle);

    void X(long j);

    String Z0();

    MediaMetadataCompat c();

    void c0(float f);

    PlaybackStateCompat d();

    boolean d0(KeyEvent keyEvent);

    void f();

    long g();

    Bundle getExtras();

    String getTag();

    void i0(RatingCompat ratingCompat, Bundle bundle);

    void k0(MediaDescriptionCompat mediaDescriptionCompat, int i);

    void m(String str, Bundle bundle);

    void n0(boolean z);

    void next();

    void p();

    void pause();

    void previous();

    void q(RatingCompat ratingCompat);

    void r(Uri uri, Bundle bundle);

    void s(MediaDescriptionCompat mediaDescriptionCompat);

    void stop();

    boolean t();

    void u();

    void u0();

    void v(MediaDescriptionCompat mediaDescriptionCompat);

    void v0(int i);

    PendingIntent w();

    void w0();

    void x0(InterfaceC12174zd1 interfaceC12174zd1);

    void z();
}
