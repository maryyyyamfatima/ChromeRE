package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.AbstractC4242cX;
import defpackage.BP1;
import defpackage.C11758yP1;
import defpackage.C12091zN1;
import defpackage.C6614jQ1;
import defpackage.C7727mf2;
import defpackage.CP1;
import defpackage.DP1;
import defpackage.DQ1;
import defpackage.DialogC5834h8;
import defpackage.EP1;
import defpackage.FP1;
import defpackage.GP1;
import defpackage.HP1;
import defpackage.IP1;
import defpackage.JP1;
import defpackage.KP1;
import defpackage.LP1;
import defpackage.MQ1;
import defpackage.NP1;
import defpackage.VP1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d extends DialogC5834h8 {
    public static final int t0 = (int) TimeUnit.SECONDS.toMillis(30);
    public TextView A;
    public TextView B;
    public final boolean C;
    public final boolean D;
    public LinearLayout E;
    public RelativeLayout F;
    public LinearLayout G;
    public View H;
    public OverlayListView I;

    /* renamed from: J, reason: collision with root package name */
    public c f11486J;
    public ArrayList K;
    public HashSet L;
    public HashSet M;
    public HashSet N;
    public SeekBar O;
    public NP1 P;
    public DQ1 Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public HashMap V;
    public C12091zN1 W;
    public final KP1 X;
    public PlaybackStateCompat Y;
    public MediaDescriptionCompat Z;
    public JP1 a0;
    public Bitmap b0;
    public Uri c0;
    public boolean d0;
    public Bitmap e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public final MQ1 k;
    public boolean k0;
    public final LP1 l;
    public int l0;
    public final DQ1 m;
    public int m0;
    public final Context n;
    public int n0;
    public boolean o;
    public Interpolator o0;
    public boolean p;
    public final Interpolator p0;
    public int q;
    public final Interpolator q0;
    public Button r;
    public final AccessibilityManager r0;
    public Button s;
    public final BP1 s0;
    public ImageButton t;
    public MediaRouteExpandCollapseButton u;
    public FrameLayout v;
    public LinearLayout w;
    public FrameLayout x;
    public ImageView y;
    public TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            android.view.ContextThemeWrapper r4 = androidx.mediarouter.app.f.a(r0, r4, r1)
            int r0 = androidx.mediarouter.app.f.b(r4)
            r3.<init>(r4, r0)
            r3.C = r1
            BP1 r0 = new BP1
            r0.<init>(r3)
            r3.s0 = r0
            android.content.Context r0 = r3.getContext()
            r3.n = r0
            KP1 r1 = new KP1
            r1.<init>(r3)
            r3.X = r1
            MQ1 r1 = defpackage.MQ1.d(r0)
            r3.k = r1
            boolean r1 = defpackage.MQ1.h()
            r3.D = r1
            LP1 r1 = new LP1
            r1.<init>(r3)
            r3.l = r1
            DQ1 r1 = defpackage.MQ1.g()
            r3.m = r1
            android.support.v4.media.session.MediaSessionCompat$Token r1 = defpackage.MQ1.e()
            r3.m(r1)
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131232009(0x7f080509, float:1.8080115E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.U = r1
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.r0 = r0
            r0 = 2131558422(0x7f0d0016, float:1.874216E38)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.p0 = r0
            r0 = 2131558421(0x7f0d0015, float:1.8742157E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.q0 = r4
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.<init>(android.content.Context):void");
    }

    public final boolean k() {
        DQ1 dq1 = this.m;
        return dq1.e() && dq1.a().size() > 1;
    }

    public final void m(MediaSessionCompat$Token mediaSessionCompat$Token) {
        C12091zN1 c12091zN1 = this.W;
        KP1 kp1 = this.X;
        PlaybackStateCompat playbackStateCompat = null;
        if (c12091zN1 != null) {
            c12091zN1.d(kp1);
            this.W = null;
        }
        if (mediaSessionCompat$Token != null && this.p) {
            C12091zN1 c12091zN12 = new C12091zN1(this.n, mediaSessionCompat$Token);
            this.W = c12091zN12;
            c12091zN12.c(kp1);
            MediaMetadataCompat a = this.W.a();
            this.Z = a == null ? null : a.c();
            android.support.v4.media.session.c cVar = this.W.a;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = cVar.e;
            if (mediaSessionCompat$Token2.a() != null) {
                try {
                    playbackStateCompat = mediaSessionCompat$Token2.a().d();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
                this.Y = playbackStateCompat;
                o();
                n(false);
            }
            PlaybackState playbackState = cVar.a.getPlaybackState();
            if (playbackState != null) {
                playbackStateCompat = PlaybackStateCompat.a(playbackState);
            }
            this.Y = playbackStateCompat;
            o();
            n(false);
        }
    }

    @Override // defpackage.DialogC5834h8, defpackage.DialogC0805Gf, defpackage.DialogC8536p00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(com.android.chrome.R.layout.f58850_resource_name_obfuscated_res_0x7f0e0192);
        findViewById(R.id.button3).setVisibility(8);
        IP1 ip1 = new IP1(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(com.android.chrome.R.id.mr_expandable_area);
        this.v = frameLayout;
        frameLayout.setOnClickListener(new CP1(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(com.android.chrome.R.id.mr_dialog_area);
        this.w = linearLayout;
        linearLayout.setOnClickListener(new DP1());
        Context context = this.n;
        int f = f.f(com.android.chrome.R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context);
        if (AbstractC4242cX.c(f, f.f(R.attr.colorBackground, context)) < 3.0d) {
            f = f.f(com.android.chrome.R.attr.f4800_resource_name_obfuscated_res_0x7f05010d, context);
        }
        Button button = (Button) findViewById(R.id.button2);
        this.r = button;
        button.setText(com.android.chrome.R.string.f77900_resource_name_obfuscated_res_0x7f14067b);
        this.r.setTextColor(f);
        this.r.setOnClickListener(ip1);
        Button button2 = (Button) findViewById(R.id.button1);
        this.s = button2;
        button2.setText(com.android.chrome.R.string.f77970_resource_name_obfuscated_res_0x7f140682);
        this.s.setTextColor(f);
        this.s.setOnClickListener(ip1);
        this.B = (TextView) findViewById(com.android.chrome.R.id.mr_name);
        ((ImageButton) findViewById(com.android.chrome.R.id.mr_close)).setOnClickListener(ip1);
        this.x = (FrameLayout) findViewById(com.android.chrome.R.id.mr_default_control);
        EP1 ep1 = new EP1(this);
        ImageView imageView = (ImageView) findViewById(com.android.chrome.R.id.mr_art);
        this.y = imageView;
        imageView.setOnClickListener(ep1);
        findViewById(com.android.chrome.R.id.mr_control_title_container).setOnClickListener(ep1);
        this.E = (LinearLayout) findViewById(com.android.chrome.R.id.mr_media_main_control);
        this.H = findViewById(com.android.chrome.R.id.mr_control_divider);
        this.F = (RelativeLayout) findViewById(com.android.chrome.R.id.mr_playback_control);
        this.z = (TextView) findViewById(com.android.chrome.R.id.mr_control_title);
        this.A = (TextView) findViewById(com.android.chrome.R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(com.android.chrome.R.id.mr_control_playback_ctrl);
        this.t = imageButton;
        imageButton.setOnClickListener(ip1);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(com.android.chrome.R.id.mr_volume_control);
        this.G = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(com.android.chrome.R.id.mr_volume_slider);
        this.O = seekBar;
        DQ1 dq1 = this.m;
        seekBar.setTag(dq1);
        NP1 np1 = new NP1(this);
        this.P = np1;
        this.O.setOnSeekBarChangeListener(np1);
        this.I = (OverlayListView) findViewById(com.android.chrome.R.id.mr_volume_group_list);
        this.K = new ArrayList();
        c cVar = new c(this, this.I.getContext(), this.K);
        this.f11486J = cVar;
        this.I.setAdapter((ListAdapter) cVar);
        this.N = new HashSet();
        LinearLayout linearLayout3 = this.E;
        OverlayListView overlayListView = this.I;
        boolean k = k();
        int f2 = f.f(com.android.chrome.R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context);
        int f3 = f.f(com.android.chrome.R.attr.f5270_resource_name_obfuscated_res_0x7f05013c, context);
        if (k && f.c(context) == -570425344) {
            f3 = f2;
            f2 = -1;
        }
        linearLayout3.setBackgroundColor(f2);
        overlayListView.setBackgroundColor(f3);
        linearLayout3.setTag(Integer.valueOf(f2));
        overlayListView.setTag(Integer.valueOf(f3));
        f.i(context, (MediaRouteVolumeSlider) this.O, this.E);
        HashMap hashMap = new HashMap();
        this.V = hashMap;
        hashMap.put(dq1, this.O);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(com.android.chrome.R.id.mr_group_expand_collapse);
        this.u = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new FP1(this));
        this.o0 = this.i0 ? this.p0 : this.q0;
        this.l0 = context.getResources().getInteger(com.android.chrome.R.integer.f54840_resource_name_obfuscated_res_0x7f0c0074);
        this.m0 = context.getResources().getInteger(com.android.chrome.R.integer.f54850_resource_name_obfuscated_res_0x7f0c0075);
        this.n0 = context.getResources().getInteger(com.android.chrome.R.integer.f54860_resource_name_obfuscated_res_0x7f0c0076);
        this.o = true;
        p();
    }

    public final void p() {
        Context context = this.n;
        int a = VP1.a(context);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.q = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.R = resources.getDimensionPixelSize(com.android.chrome.R.dimen.f36050_resource_name_obfuscated_res_0x7f080507);
        this.S = resources.getDimensionPixelSize(com.android.chrome.R.dimen.f36040_resource_name_obfuscated_res_0x7f080506);
        this.T = resources.getDimensionPixelSize(com.android.chrome.R.dimen.f36060_resource_name_obfuscated_res_0x7f080508);
        this.b0 = null;
        this.c0 = null;
        o();
        n(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = true;
        this.k.a(C6614jQ1.c, this.l, 2);
        m(MQ1.e());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.k.j(this.l);
        m(null);
        this.p = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.DialogC5834h8, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            if (this.D || !this.i0) {
                this.m.k(i == 25 ? -1 : 1);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.DialogC5834h8, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(boolean r13) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.n(boolean):void");
    }

    public final boolean g() {
        return (this.Z == null && this.Y == null) ? false : true;
    }

    public final int j(boolean z) {
        if (!z && this.G.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.E.getPaddingBottom() + this.E.getPaddingTop() + 0;
        if (z) {
            paddingBottom += this.F.getMeasuredHeight();
        }
        int measuredHeight = this.G.getVisibility() == 0 ? this.G.getMeasuredHeight() + paddingBottom : paddingBottom;
        return (z && this.G.getVisibility() == 0) ? measuredHeight + this.H.getMeasuredHeight() : measuredHeight;
    }

    public final void r(boolean z) {
        int i = 0;
        this.H.setVisibility((this.G.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.E;
        if (this.G.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final void q(boolean z) {
        this.x.requestLayout();
        this.x.getViewTreeObserver().addOnGlobalLayoutListener(new GP1(this, z));
    }

    public final void i(boolean z) {
        this.L = null;
        this.M = null;
        this.j0 = false;
        if (this.k0) {
            this.k0 = false;
            q(z);
        }
        this.I.setEnabled(true);
    }

    public final void h(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.I.getFirstVisiblePosition();
        for (int i = 0; i < this.I.getChildCount(); i++) {
            View childAt = this.I.getChildAt(i);
            DQ1 dq1 = (DQ1) this.f11486J.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.L) == null || !hashSet.contains(dq1)) {
                ((LinearLayout) childAt.findViewById(com.android.chrome.R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.I.a.iterator();
        while (it.hasNext()) {
            C7727mf2 c7727mf2 = (C7727mf2) it.next();
            c7727mf2.k = true;
            c7727mf2.l = true;
            C11758yP1 c11758yP1 = c7727mf2.m;
            if (c11758yP1 != null) {
                d dVar = c11758yP1.b;
                dVar.N.remove(c11758yP1.a);
                dVar.f11486J.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        i(false);
    }

    public final void f(View view, int i) {
        HP1 hp1 = new HP1(view.getLayoutParams().height, i, (ViewGroup) view);
        hp1.setDuration(this.l0);
        hp1.setInterpolator(this.o0);
        view.startAnimation(hp1);
    }

    public static void l(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:            if (((r0 != null && r0.equals(r1)) || (r0 == null && r1 == null)) == false) goto L29;     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r6 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r6.Z
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L9
        L7:
            android.graphics.Bitmap r2 = r0.j
        L9:
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            android.net.Uri r1 = r0.k
        Le:
            JP1 r0 = r6.a0
            if (r0 != 0) goto L15
            android.graphics.Bitmap r3 = r6.b0
            goto L17
        L15:
            android.graphics.Bitmap r3 = r0.a
        L17:
            if (r0 != 0) goto L1c
            android.net.Uri r0 = r6.c0
            goto L1e
        L1c:
            android.net.Uri r0 = r0.b
        L1e:
            r4 = 0
            r5 = 1
            if (r3 == r2) goto L23
            goto L37
        L23:
            if (r3 != 0) goto L39
            if (r0 == 0) goto L2e
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L2e
            goto L32
        L2e:
            if (r0 != 0) goto L34
            if (r1 != 0) goto L34
        L32:
            r0 = r5
            goto L35
        L34:
            r0 = r4
        L35:
            if (r0 != 0) goto L39
        L37:
            r0 = r5
            goto L3a
        L39:
            r0 = r4
        L3a:
            if (r0 == 0) goto L5a
            boolean r0 = r6.k()
            if (r0 == 0) goto L47
            boolean r0 = r6.D
            if (r0 != 0) goto L47
            goto L5a
        L47:
            JP1 r0 = r6.a0
            if (r0 == 0) goto L4e
            r0.cancel(r5)
        L4e:
            JP1 r0 = new JP1
            r0.<init>(r6)
            r6.a0 = r0
            java.lang.Void[] r1 = new java.lang.Void[r4]
            r0.execute(r1)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.o():void");
    }
}
