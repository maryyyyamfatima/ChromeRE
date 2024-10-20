package com.google.chrome.elements.video.lightbox;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.a;
import androidx.fragment.app.h;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.AbstractC7243lE2;
import defpackage.AbstractC9415ra4;
import defpackage.C10547us;
import defpackage.C1127Ir1;
import defpackage.C4949ea4;
import defpackage.C7355la4;
import defpackage.C8043na4;
import defpackage.InterfaceC5462g31;
import defpackage.XF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VideoLightboxActivity extends a {
    public final C4949ea4 A = new C4949ea4(this);
    public C7355la4 y;
    public C8043na4 z;

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        super.onCreate(bundle);
        Intent intent = getIntent();
        try {
            C8043na4 c8043na4 = C8043na4.n;
            XF0 d = XF0.d();
            Parcelable parcelableExtra = intent.getParcelableExtra("lightbox_fragment_args_proto");
            if (parcelableExtra instanceof Bundle) {
                Bundle bundle2 = (Bundle) parcelableExtra;
                bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
            }
            C8043na4 c8043na42 = (C8043na4) AbstractC7243lE2.a(protoParsers$InternalDontUse, c8043na4, d);
            this.z = c8043na42;
            C7355la4 c7355la4 = new C7355la4();
            Bundle bundle3 = new Bundle();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, c8043na42));
            bundle3.putParcelable("VideoLightboxFragmentKey", bundle4);
            c7355la4.E0(bundle3);
            this.y = c7355la4;
            c7355la4.f0 = this.A;
            h h0 = h0();
            h0.getClass();
            C10547us c10547us = new C10547us(h0);
            c10547us.j(R.id.content, this.y, "VideoLightboxFragment");
            c10547us.f();
        } catch (C1127Ir1 e) {
            throw new IllegalArgumentException("VideoLightboxActivity launched with malformed LightBoxVideo data", e);
        }
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        int i;
        super.onDestroy();
        C8043na4 c8043na4 = this.z;
        if (c8043na4 == null || (i = c8043na4.l) <= 0) {
            return;
        }
        ((InterfaceC5462g31) AbstractC9415ra4.a.d().g("com/google/chrome/elements/video/lightbox/VideoLightboxObjectStore", 61, "remove", "VideoLightboxObjectStore.java")).d(i, "Removed object at %d for lightbox");
        AbstractC9415ra4.b.remove(Integer.valueOf(i));
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onBackPressed() {
        C7355la4 c7355la4 = (C7355la4) h0().B("VideoLightboxFragment");
        if (c7355la4 != null) {
            c7355la4.L0(11);
        }
        super.onBackPressed();
    }
}
