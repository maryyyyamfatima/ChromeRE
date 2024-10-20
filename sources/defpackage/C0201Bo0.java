package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0201Bo0 implements InterfaceC12242zo3, InterfaceC10184to3 {
    public boolean c;
    public Object e;
    public Object f;
    public boolean g;
    public C7744mi1 h;
    public BinderC9838so0 i;
    public MotionEvent j;
    public MotionEvent k;
    public Rect l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final C9153qo0 a = new C9153qo0();
    public final C10181to0 b = new C10181to0();
    public final Handler d = new Handler();

    @Override // defpackage.InterfaceC12242zo3
    public final boolean b() {
        return false;
    }

    @Override // defpackage.InterfaceC10184to3
    public final C0201Bo0 e() {
        return this;
    }

    @Override // defpackage.InterfaceC10184to3
    public final void g(Context context, WebContents webContents) {
        r(context);
        webContents.V0(this);
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void j(Rect rect, boolean z) {
        MotionEvent motionEvent;
        if (this.g) {
            C9153qo0 c9153qo0 = this.a;
            if (!c9153qo0.a() || this.h == null) {
                return;
            }
            this.l = rect;
            BinderC9838so0 binderC9838so0 = this.i;
            Point point = new Point();
            binderC9838so0.j = rect;
            binderC9838so0.k = point;
            if (z) {
                if (this.m || !this.n || (motionEvent = this.k) == null) {
                    return;
                }
                q(rect, motionEvent);
                this.n = false;
                c9153qo0.f(rect, this.h.a());
                return;
            }
            o();
            q(null, null);
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final boolean m(C7744mi1 c7744mi1) {
        if (!this.g || !this.a.a()) {
            return false;
        }
        this.h = c7744mi1;
        this.i.l = c7744mi1;
        this.m = true;
        return true;
    }

    public final void r(Context context) {
        boolean z = this.g;
        this.g = AbstractC10524uo0.a(context);
        AbstractC4851eH1.d("DWTrigger", "updateDWServiceStatus() : isEnabled = " + this.g, new Object[0]);
        if (!z && this.g && this.i == null) {
            this.i = new BinderC9838so0();
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void a(boolean z) {
        if (z) {
            return;
        }
        o();
        q(null, null);
    }

    @Override // defpackage.InterfaceC10184to3
    public final void i(Context context, boolean z) {
        if (z) {
            r(context);
        } else {
            o();
        }
        if (this.g) {
            C9153qo0 c9153qo0 = this.a;
            if (!z) {
                c9153qo0.getClass();
            } else if (c9153qo0.a()) {
                c9153qo0.b();
                return;
            }
            if (context.getPackageName().equals(c9153qo0.c)) {
                String packageName = context.getPackageName();
                if (c9153qo0.a()) {
                    try {
                        ((C0787Gb1) c9153qo0.a).i1(packageName);
                    } catch (DeadObjectException e) {
                        AbstractC4851eH1.a("DWServiceBinder", "onWindowFocusLost failed due to DeadObjectException.", e);
                        c9153qo0.c();
                    } catch (Exception e2) {
                        AbstractC4851eH1.a("DWServiceBinder", "onWindowFocusLost failed.", e2);
                    }
                }
            }
            c9153qo0.e();
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void f(Context context) {
        if (this.g) {
            C9153qo0 c9153qo0 = this.a;
            if (c9153qo0.a()) {
                c9153qo0.d(context);
            }
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void c(View view, MotionEvent motionEvent) {
        if (this.g) {
            if (motionEvent.getToolType(0) == 2 || motionEvent.getToolType(0) == 4) {
                C9153qo0 c9153qo0 = this.a;
                if (!c9153qo0.a() && motionEvent.getAction() == 9) {
                    Context context = view.getContext();
                    C0071Ao0 c0071Ao0 = new C0071Ao0(this);
                    if (!c9153qo0.a() && !context.getPackageName().equals(c9153qo0.c)) {
                        ArrayList b = AbstractC4983eg2.b(context.getPackageManager(), "com.samsung.android.honeyboard");
                        if (b == null || b.size() > 1 || (!((String) b.get(0)).equals("34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42") && !((String) b.get(0)).equals("C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8"))) {
                            AbstractC4851eH1.a("DWServiceBinder", "Don't connect to service due to package fingerprint mismatch", new Object[0]);
                        } else {
                            try {
                                Intent intent = new Intent();
                                intent.setComponent(new ComponentName("com.samsung.android.honeyboard", "com.samsung.android.directwriting.service.DirectWritingService"));
                                context.bindService(intent, c9153qo0.d, 1);
                                c9153qo0.c = context.getPackageName();
                                c9153qo0.e = c0071Ao0;
                                c9153qo0.f = context;
                            } catch (RuntimeException e) {
                                AbstractC4851eH1.a("DWServiceBinder", "bindService failed," + e, new Object[0]);
                            }
                        }
                    }
                }
                n(view, motionEvent);
            }
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final boolean d(View view, MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        boolean z = true;
        if (motionEvent.isButtonPressed(32)) {
            if (motionEvent.getAction() == 0) {
                this.o = true;
            }
        } else if (!this.o) {
            z = false;
        } else if (motionEvent.getAction() == 1) {
            this.o = false;
        }
        if (z) {
            return false;
        }
        if (motionEvent.getToolType(0) == 2 || motionEvent.getToolType(0) == 4) {
            return n(view, motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            o();
        }
        return false;
    }

    public final void p(View view, MotionEvent motionEvent) {
        C9153qo0 c9153qo0 = this.a;
        if (c9153qo0.a()) {
            try {
                InterfaceC1047Ib1 interfaceC1047Ib1 = c9153qo0.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("event", motionEvent);
                bundle.putParcelable("rootViewRect", AbstractC8467oo0.c(view));
                ((C0787Gb1) interfaceC1047Ib1).h(bundle);
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "onDispatchEvent failed due to DeadObjectException.", e);
                c9153qo0.c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "onDispatchEvent failed.", e2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [yo0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [zo0] */
    public final boolean n(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int action = motionEvent.getAction();
        Handler handler = this.d;
        if (action == 0) {
            Object obj = this.f;
            if (obj != null) {
                handler.removeCallbacksAndMessages(obj);
                this.f = null;
            }
            this.j = MotionEvent.obtain(motionEvent);
            this.n = false;
            Object obj2 = this.e;
            if (obj2 != null) {
                handler.removeCallbacksAndMessages(obj2);
                this.e = null;
                p(view, motionEvent);
                return true;
            }
            this.m = false;
            this.c = false;
            return false;
        }
        C10181to0 c10181to0 = this.b;
        if (action == 1) {
            if (this.c) {
                p(view, motionEvent);
                Object obj3 = new Object();
                this.e = obj3;
                handler.postDelayed(new Runnable() { // from class: yo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0201Bo0 c0201Bo0 = C0201Bo0.this;
                        c0201Bo0.c = false;
                        c0201Bo0.j = null;
                        c0201Bo0.k = null;
                        c0201Bo0.e = null;
                    }
                }, obj3, c10181to0.b);
                return true;
            }
            Rect rect = this.l;
            if (rect != null && !rect.isEmpty() && (motionEvent2 = this.j) != null && this.l.contains((int) motionEvent2.getX(), (int) this.j.getY())) {
                q(this.l, motionEvent);
            } else {
                this.k = MotionEvent.obtain(motionEvent);
                this.n = true;
            }
            return false;
        }
        if (action == 2) {
            if (!this.c) {
                return false;
            }
            p(view, motionEvent);
            return true;
        }
        if (action != 9) {
            if (action == 10 && this.c) {
                Object obj4 = new Object();
                this.f = obj4;
                handler.postDelayed(new Runnable() { // from class: zo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0201Bo0 c0201Bo0 = C0201Bo0.this;
                        c0201Bo0.q(null, null);
                        c0201Bo0.f = null;
                    }
                }, obj4, c10181to0.a);
            }
        } else {
            Object obj5 = this.f;
            if (obj5 != null) {
                handler.removeCallbacksAndMessages(obj5);
                this.f = null;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void h(int i, int i2, String str) {
        if (this.g && this.a.a()) {
            BinderC9838so0 binderC9838so0 = this.i;
            binderC9838so0.i = str;
            binderC9838so0.g = i;
            binderC9838so0.h = i2;
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void l(Rect rect, Point point) {
        C7744mi1 c7744mi1;
        if (rect.isEmpty() || !this.m || (c7744mi1 = this.h) == null) {
            return;
        }
        BinderC9838so0 binderC9838so0 = this.i;
        binderC9838so0.j = rect;
        binderC9838so0.k = point;
        View a = c7744mi1.a();
        C9153qo0 c9153qo0 = this.a;
        c9153qo0.f(rect, a);
        if (this.j == null) {
            return;
        }
        View a2 = this.h.a();
        MotionEvent motionEvent = this.j;
        boolean z = false;
        if (!c9153qo0.a()) {
            AbstractC4851eH1.a("DWServiceBinder", "startRecognition failed, not bounded", new Object[0]);
        } else {
            try {
                ((C0787Gb1) c9153qo0.a).f1(AbstractC8467oo0.a(rect, motionEvent, a2));
                z = true;
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "startRecognition failed due to DeadObjectException.", e);
                c9153qo0.c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "startRecognition failed with exception.", e2);
            }
        }
        if (z) {
            this.c = true;
            p(a2, this.j);
            GestureListenerManagerImpl d = GestureListenerManagerImpl.d(this.h.a.k);
            if (d != null) {
                long j = d.k;
                if (j != 0) {
                    N.MMR0DKoy(j, d);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12242zo3
    public final void k(EditorInfo editorInfo) {
        if (this.g) {
            C9153qo0 c9153qo0 = this.a;
            if (c9153qo0.a()) {
                this.i.a = editorInfo;
                if (c9153qo0.a()) {
                    try {
                        ((C0787Gb1) c9153qo0.a).h1(editorInfo.imeOptions);
                    } catch (DeadObjectException e) {
                        AbstractC4851eH1.a("DWServiceBinder", "updateEditorInfo failed due to DeadObjectException.", e);
                        c9153qo0.c();
                    } catch (Exception e2) {
                        AbstractC4851eH1.a("DWServiceBinder", "updateEditorInfo failed.", e2);
                    }
                }
            }
        }
    }

    public final void q(Rect rect, MotionEvent motionEvent) {
        C7744mi1 c7744mi1;
        if (!this.g || (c7744mi1 = this.h) == null) {
            return;
        }
        View a = c7744mi1.a();
        C9153qo0 c9153qo0 = this.a;
        if (c9153qo0.a()) {
            try {
                ((C0787Gb1) c9153qo0.a).g1(AbstractC8467oo0.a(rect, motionEvent, a));
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "onStopRecognition failed due to DeadObjectException.", e);
                c9153qo0.c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "onStopRecognition failed.", e2);
            }
        }
        this.c = false;
        this.j = null;
        this.k = null;
    }

    public final void o() {
        if (this.g) {
            C9153qo0 c9153qo0 = this.a;
            if (c9153qo0.a()) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("hostSource", "webview");
                    ((C0787Gb1) c9153qo0.a).M0(bundle);
                } catch (DeadObjectException e) {
                    AbstractC4851eH1.a("DWServiceBinder", "hideDWToolbar failed due to DeadObjectException.", e);
                    c9153qo0.c();
                } catch (Exception e2) {
                    AbstractC4851eH1.a("DWServiceBinder", "hideDWToolbar failed.", e2);
                }
            }
        }
    }
}
