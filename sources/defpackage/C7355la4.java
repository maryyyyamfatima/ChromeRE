package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.android.chrome.R;
import com.bumptech.glide.a;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: la4 */
/* loaded from: classes.dex */
public final class C7355la4 extends c {
    public static final C6492j31 i0 = C6492j31.k("com/google/chrome/elements/video/lightbox/VideoLightboxFragment");
    public Fa4 b0;
    public SA1 c0;
    public Ha4 d0;
    public PA1 e0;
    public C4949ea4 f0;
    public Ks4 g0;
    public int h0;

    public final void M0(boolean z) {
        int i = z ? 8 : 0;
        PA1 pa1 = this.e0;
        ImageView imageView = pa1.g;
        TextView textView = pa1.e;
        TextView textView2 = pa1.f;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        if (textView != null) {
            textView.setVisibility(i);
        }
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
    }

    public final void L0(int i) {
        Ha4 ha4 = this.d0;
        if (ha4 != null) {
            Ks4 ks4 = this.g0;
            C9758sa4 c9758sa4 = ha4.a;
            if (ks4 != null) {
                c9758sa4.b(i, Optional.empty());
            } else {
                c9758sa4.b(i, Optional.empty());
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        float f;
        Bundle bundle2 = this.l;
        if (bundle2 == null || !bundle2.containsKey("VideoLightboxFragmentKey")) {
            return null;
        }
        try {
            C8043na4 c8043na4 = C8043na4.n;
            XF0 d = XF0.d();
            Parcelable parcelable = bundle2.getParcelable("VideoLightboxFragmentKey");
            if (parcelable instanceof Bundle) {
                Bundle bundle3 = (Bundle) parcelable;
                bundle3.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle3.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
            }
            C8043na4 c8043na42 = (C8043na4) AbstractC7243lE2.a(protoParsers$InternalDontUse, c8043na4, d);
            int i = c8043na42.l;
            HashMap hashMap = AbstractC9415ra4.b;
            final C8730pa4 c8730pa4 = !hashMap.containsKey(Integer.valueOf(i)) ? null : (C8730pa4) hashMap.get(Integer.valueOf(i));
            if (c8730pa4 == null) {
                ((InterfaceC5462g31) i0.e().g("com/google/chrome/elements/video/lightbox/VideoLightboxFragment", 116, "onCreateView", "VideoLightboxFragment.java")).d(i, "Object at %d for lightbox not found");
                return null;
            }
            this.b0 = c8730pa4.a;
            c8730pa4.b.getClass();
            if (viewGroup == null) {
                throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
            }
            this.e0 = new PA1(viewGroup);
            SA1 sa1 = c8043na42.k;
            if (sa1 == null) {
                sa1 = SA1.t;
            }
            this.c0 = sa1;
            Ia4 ia4 = c8730pa4.c;
            C2187Qv2 c2187Qv2 = (C2187Qv2) C2317Rv2.l.j();
            C7017kb4 c7017kb4 = this.c0.k;
            if (c7017kb4 == null) {
                c7017kb4 = C7017kb4.r;
            }
            if (c2187Qv2.h) {
                c2187Qv2.l();
                c2187Qv2.h = false;
            }
            C2317Rv2 c2317Rv2 = (C2317Rv2) c2187Qv2.g;
            c2317Rv2.getClass();
            c2317Rv2.k = c7017kb4;
            c2317Rv2.j = 1;
            C2317Rv2 c2317Rv22 = (C2317Rv2) c2187Qv2.j();
            Consumer consumer = new Consumer() { // from class: ga4
                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer.CC.$default$andThen(this, consumer2);
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    Vb4 vb4 = (Vb4) obj;
                    C6492j31 c6492j31 = C7355la4.i0;
                    C7355la4 c7355la4 = C7355la4.this;
                    c7355la4.getClass();
                    InterfaceC6525j84 interfaceC6525j84 = c8730pa4.d;
                    C10409uU c10409uU = c7355la4.c0.r;
                    if (c10409uU == null) {
                        c10409uU = C10409uU.v;
                    }
                    Ab4.a(interfaceC6525j84, c10409uU, vb4);
                }
            };
            C10101ta4 c10101ta4 = (C10101ta4) ia4.a.get();
            Ia4.a(1, c10101ta4);
            Ia4.a(2, c2317Rv22);
            this.d0 = new Ha4(c10101ta4, c2317Rv22, consumer);
            PA1 pa1 = this.e0;
            ViewGroup viewGroup2 = pa1.a;
            View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0167, viewGroup2, false);
            pa1.b = inflate.findViewById(R.id.loading_indicator);
            pa1.c = (ViewGroup) inflate.findViewById(R.id.video_player);
            pa1.d = (ViewGroup) inflate.findViewById(R.id.video_container);
            pa1.e = (TextView) inflate.findViewById(R.id.video_title);
            pa1.g = (ImageView) inflate.findViewById(R.id.close_button);
            pa1.f = (TextView) inflate.findViewById(R.id.video_attribution);
            ViewGroup.LayoutParams layoutParams = this.e0.d.getLayoutParams();
            float f2 = K().getResources().getDisplayMetrics().widthPixels;
            C7017kb4 c7017kb42 = this.c0.k;
            if ((c7017kb42 == null ? C7017kb4.r : c7017kb42).m > 0.0f) {
                if (c7017kb42 == null) {
                    c7017kb42 = C7017kb4.r;
                }
                f = c7017kb42.m;
            } else {
                f = 1.7777778f;
            }
            layoutParams.height = (int) (f2 / f);
            this.e0.g.setOnClickListener(new View.OnClickListener() { // from class: ha4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7355la4 c7355la4 = C7355la4.this;
                    C4949ea4 c4949ea4 = c7355la4.f0;
                    if (c4949ea4 != null) {
                        c4949ea4.a.finish();
                    }
                    c7355la4.L0(11);
                }
            });
            C7017kb4 c7017kb43 = this.c0.k;
            if (c7017kb43 == null) {
                c7017kb43 = C7017kb4.r;
            }
            String str = c7017kb43.o;
            PA1 pa12 = this.e0;
            TextView textView = pa12.e;
            TextView textView2 = pa12.f;
            if (!str.isEmpty()) {
                ViewOnClickListenerC7011ka4 viewOnClickListenerC7011ka4 = new ViewOnClickListenerC7011ka4(this);
                textView.setOnClickListener(viewOnClickListenerC7011ka4);
                textView2.setOnClickListener(viewOnClickListenerC7011ka4);
            }
            return inflate;
        } catch (C1127Ir1 e) {
            throw new IllegalArgumentException("VideoLightboxFragment launched with malformed arguments", e);
        }
    }

    @Override // androidx.fragment.app.c
    public final void t0() {
        this.f11484J = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fa4
            @Override // java.lang.Runnable
            public final void run() {
                final C7355la4 c7355la4 = C7355la4.this;
                if (c7355la4.g0 == null) {
                    Fa4 fa4 = c7355la4.b0;
                    VS0 vs0 = (VS0) c7355la4.getActivity();
                    ViewGroup viewGroup = c7355la4.e0.c;
                    C7017kb4 c7017kb4 = c7355la4.c0.k;
                    if (c7017kb4 == null) {
                        c7017kb4 = C7017kb4.r;
                    }
                    Ks4 a = fa4.a(vs0, viewGroup, c7017kb4);
                    c7355la4.g0 = a;
                    PA1 pa1 = c7355la4.e0;
                    SA1 sa1 = c7355la4.c0;
                    TextView textView = pa1.e;
                    if (textView != null) {
                        textView.setText(sa1.p);
                    }
                    TextView textView2 = pa1.f;
                    if (textView2 != null) {
                        String str = sa1.l;
                        boolean isEmpty = sa1.n.isEmpty();
                        Character ch = PA1.i;
                        if (!isEmpty) {
                            if (!str.isEmpty()) {
                                str = str + " " + ch + " ";
                            }
                            str = AbstractC7848n0.a(str, sa1.n);
                        }
                        if (!sa1.o.isEmpty()) {
                            if (!str.isEmpty()) {
                                str = str + " " + ch + " ";
                            }
                            str = AbstractC7848n0.a(str, sa1.o);
                        }
                        textView2.setText(str);
                        if (!sa1.m.isEmpty()) {
                            Context context = pa1.a.getContext();
                            Uri parse = Uri.parse(sa1.m);
                            pa1.h.getClass();
                            IN2 in2 = (IN2) a.d(context).r(parse).i();
                            in2.H(new NA1(pa1.f), null, in2, DE0.a);
                        }
                    }
                    a.g();
                    pa1.c.setVisibility(0);
                    c7355la4.g0.f.add(c7355la4.d0);
                    Ks4 ks4 = c7355la4.g0;
                    ks4.j = new C6325ia4(c7355la4);
                    ks4.e.add(new InterfaceC11130wa4() { // from class: ja4
                        @Override // defpackage.InterfaceC11130wa4
                        public final void a(EnumC10787va4 enumC10787va4) {
                            C6492j31 c6492j31 = C7355la4.i0;
                            C7355la4 c7355la42 = C7355la4.this;
                            c7355la42.getClass();
                            if (enumC10787va4.equals(EnumC10787va4.PLAYING)) {
                                ViewGroup viewGroup2 = c7355la42.e0.d;
                                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                                layoutParams.height = -2;
                                viewGroup2.setLayoutParams(layoutParams);
                            }
                        }
                    });
                }
                c7355la4.g0.h();
            }
        });
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        int i = this.h0;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.h0 = i2;
            if (i2 == 2) {
                M0(true);
                Ks4 ks4 = this.g0;
                if (ks4 != null) {
                    ks4.j(true);
                    return;
                }
                return;
            }
            if (i2 == 1) {
                M0(false);
                Ks4 ks42 = this.g0;
                if (ks42 != null) {
                    ks42.j(false);
                }
            }
        }
    }

    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        L0(6);
    }

    @Override // androidx.fragment.app.c
    public final void k0() {
        this.f11484J = true;
        Ks4 ks4 = this.g0;
        if (ks4 != null) {
            ks4.i();
        }
        this.e0.c.setVisibility(8);
    }
}
