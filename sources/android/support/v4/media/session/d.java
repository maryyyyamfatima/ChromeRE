package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import defpackage.AbstractC9367rR1;
import defpackage.C11768yR1;
import defpackage.C9710sR1;
import defpackage.InterfaceC12174zd1;
import defpackage.JR1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d extends a {
    public final /* synthetic */ AbstractC9367rR1 g;

    @Override // android.support.v4.media.session.b
    public final void F0() {
    }

    @Override // android.support.v4.media.session.b
    public final void p() {
    }

    @Override // android.support.v4.media.session.b
    public final void u() {
    }

    public d(C9710sR1 c9710sR1) {
        this.g = c9710sR1;
    }

    @Override // android.support.v4.media.session.b
    public final void E0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final boolean d0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void K0(InterfaceC12174zd1 interfaceC12174zd1) {
        if (this.g.e) {
            return;
        }
        this.g.f.register(interfaceC12174zd1, new JR1(Binder.getCallingPid(), Binder.getCallingUid(), "android.media.session.MediaController"));
        synchronized (this.g.c) {
            this.g.getClass();
        }
    }

    @Override // android.support.v4.media.session.b
    public final void x0(InterfaceC12174zd1 interfaceC12174zd1) {
        this.g.f.unregister(interfaceC12174zd1);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.g.c) {
            this.g.getClass();
        }
    }

    @Override // android.support.v4.media.session.b
    public final String Z0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final Bundle O() {
        AbstractC9367rR1 abstractC9367rR1 = this.g;
        if (abstractC9367rR1.d == null) {
            return null;
        }
        return new Bundle(abstractC9367rR1.d);
    }

    @Override // android.support.v4.media.session.b
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final PendingIntent w() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final long g() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final ParcelableVolumeInfo Q0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void J(int i, int i2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void U(int i, int i2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void E() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void M(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void B(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void r(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void Q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void S(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void W(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void P0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void pause() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void V() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void J0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void X(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void q(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void i0(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void c0(float f) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void n0(boolean z) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void I0(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void U0(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void m(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final MediaMetadataCompat c() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final PlaybackStateCompat d() {
        AbstractC9367rR1 abstractC9367rR1 = this.g;
        return C11768yR1.b(abstractC9367rR1.g, abstractC9367rR1.h);
    }

    @Override // android.support.v4.media.session.b
    public final void v(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void k0(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void s(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void v0(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final CharSequence K() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.b
    public final void z() {
        this.g.getClass();
    }

    @Override // android.support.v4.media.session.b
    public final void w0() {
        this.g.getClass();
    }

    @Override // android.support.v4.media.session.b
    public final void N0() {
        this.g.getClass();
    }

    @Override // android.support.v4.media.session.b
    public final void u0() {
        this.g.getClass();
    }

    @Override // android.support.v4.media.session.b
    public final boolean t() {
        throw new AssertionError();
    }
}
