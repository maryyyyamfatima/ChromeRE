package org.chromium.content.browser.accessibility;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.SuggestionSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.AbstractC4851eH1;
import defpackage.C10191tp4;
import defpackage.C5792h1;
import defpackage.C6136i1;
import defpackage.C6478j1;
import defpackage.C6822k1;
import defpackage.C7077kl4;
import defpackage.C8541p1;
import defpackage.C8796pl4;
import defpackage.C9139ql4;
import defpackage.EI2;
import defpackage.InterfaceC6390il4;
import defpackage.InterfaceC9163qp4;
import defpackage.InterfaceC9290rC;
import defpackage.J44;
import defpackage.K44;
import defpackage.L0;
import defpackage.M0;
import defpackage.Q0;
import defpackage.RunnableC9481rl4;
import defpackage.V60;
import defpackage.XF;
import defpackage.YF;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.chromium.content.browser.accessibility.BrowserAccessibilityState;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.accessibility.captioning.CaptioningController;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebContentsAccessibilityImpl extends C8541p1 implements AccessibilityManager.AccessibilityStateChangeListener, InterfaceC6390il4, InterfaceC9163qp4, J44, InterfaceC9290rC {
    public static final List T = Collections.singletonList("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
    public static final List U = Collections.singletonList("AccessibilityNodeInfo.requestImageData");
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final Q0 I;

    /* renamed from: J, reason: collision with root package name */
    public String f11538J;
    public C9139ql4 K;
    public int L;
    public long M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final M0 g;
    public final AccessibilityManager h;
    public final Context i;
    public final String j;
    public long k;
    public boolean l;
    public int n;
    public final View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public View v;
    public final CaptioningController w;
    public boolean x;
    public int y;
    public int z;
    public int m = -1;
    public final SparseArray H = new SparseArray();
    public final HashSet S = new HashSet();

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    public void handleEndOfTestSignal() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public static WebContentsAccessibilityImpl k(WebContents webContents) {
        K44 x;
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        J44 j44 = null;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(WebContentsAccessibilityImpl.class);
            if (b == null) {
                b = x.d(WebContentsAccessibilityImpl.class, new WebContentsAccessibilityImpl(new C7077kl4(webContentsImpl)));
            }
            j44 = (J44) WebContentsAccessibilityImpl.class.cast(b);
        }
        return (WebContentsAccessibilityImpl) j44;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [nl4] */
    public WebContentsAccessibilityImpl(M0 m0) {
        boolean isEnabled;
        this.g = m0;
        View d = m0.d();
        this.o = d;
        Context context = d.getContext();
        this.i = context;
        this.j = m0.e();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.h = accessibilityManager;
        if (m0.b() != null) {
            this.w = new CaptioningController(m0.b());
            C10191tp4.e(m0.b()).b(this);
        } else {
            E(accessibilityManager.isEnabled());
        }
        m0.i(new Runnable() { // from class: nl4
            @Override // java.lang.Runnable
            public final void run() {
                WebContentsAccessibilityImpl webContentsAccessibilityImpl = WebContentsAccessibilityImpl.this;
                webContentsAccessibilityImpl.handleScrollPositionChanged(webContentsAccessibilityImpl.t);
                int i = webContentsAccessibilityImpl.t;
                webContentsAccessibilityImpl.A(i, 65536);
                webContentsAccessibilityImpl.t = -1;
                webContentsAccessibilityImpl.u(i);
            }
        });
        BrowserAccessibilityState.i.add(this);
        HashMap hashMap = new HashMap();
        hashMap.put(4096, 100);
        hashMap.put(2048, 100);
        hashMap.put(128, 50);
        HashSet hashSet = new HashSet();
        hashSet.add(128);
        this.I = new Q0(new C8796pl4(this), hashMap, hashSet, new HashSet());
        if (m0.h() != 0) {
            this.k = N.M_XV3Nwg(this, m0.h());
            v();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    isEnabled = autofillManager.isEnabled();
                    if (isEnabled) {
                        E(accessibilityManager.isEnabled());
                        o();
                    }
                }
            } catch (Exception unused) {
                AbstractC4851eH1.a("ClankAccessibility", "AutofillManager did not resolve before time limit.", new Object[0]);
            }
        }
    }

    public final void v() {
        this.t = -1;
        this.u = -1;
        this.l = false;
        this.n = -1;
        this.A = N.MPyIoFYC(this.k);
        this.K = new C9139ql4(this);
        View view = this.o;
        if (view.isAttachedToWindow()) {
            x();
        }
        if (N.Mudil8Bg("OnDemandAccessibilityEvents")) {
            view.post(new Runnable() { // from class: ol4
                @Override // java.lang.Runnable
                public final void run() {
                    List list = WebContentsAccessibilityImpl.T;
                    WebContentsAccessibilityImpl webContentsAccessibilityImpl = WebContentsAccessibilityImpl.this;
                    webContentsAccessibilityImpl.getClass();
                    int accessibilityServiceEventTypeMask = BrowserAccessibilityState.getAccessibilityServiceEventTypeMask();
                    HashSet hashSet = new HashSet();
                    while (accessibilityServiceEventTypeMask != 0) {
                        int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(accessibilityServiceEventTypeMask);
                        hashSet.add(Integer.valueOf(numberOfTrailingZeros));
                        accessibilityServiceEventTypeMask &= ~numberOfTrailingZeros;
                    }
                    Q0 q0 = webContentsAccessibilityImpl.I;
                    q0.c = hashSet;
                    q0.g = true;
                }
            });
        }
        N.McBCyHOt(this.k, this.E);
    }

    public void onNativeObjectDestroyed() {
        this.k = 0L;
    }

    public final boolean t() {
        return this.k != 0;
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onDetachedFromWindow() {
        this.h.removeAccessibilityStateChangeListener(this);
        CaptioningController captioningController = this.w;
        XF xf = captioningController.a;
        xf.a.i.remove(captioningController);
        if (!(!r2.i.isEmpty())) {
            xf.b.removeCaptioningChangeListener(xf);
        }
        if (t()) {
            V60.a.unregisterReceiver(this.K);
            if (N.Mudil8Bg("OnDemandAccessibilityEvents")) {
                boolean Mudil8Bg = N.Mudil8Bg("ComputeAXMode");
                if (!BrowserAccessibilityState.a) {
                    BrowserAccessibilityState.b();
                }
                boolean z = BrowserAccessibilityState.f;
                int i = this.N;
                if (i > 0) {
                    int i2 = (int) (((this.O * 1.0d) / i) * 100.0d);
                    int i3 = 100 - i2;
                    EI2.l(i3, "Accessibility.Android.OnDemand.PercentageDropped");
                    if (Mudil8Bg) {
                        EI2.l(i3, z ? "Accessibility.Android.OnDemand.PercentageDropped.Complete" : "Accessibility.Android.OnDemand.PercentageDropped.Basic");
                    }
                    EI2.f(this.N - this.O, 1, 10000, 100, "Accessibility.Android.OnDemand.EventsDropped");
                    if (i2 == 0) {
                        EI2.f(this.N - this.O, 1, 10000, 100, "Accessibility.Android.OnDemand.OneHundredPercentEventsDropped");
                        if (Mudil8Bg) {
                            EI2.f(this.N - this.O, 1, 10000, 100, z ? "Accessibility.Android.OnDemand.OneHundredPercentEventsDropped.Complete" : "Accessibility.Android.OnDemand.OneHundredPercentEventsDropped.Basic");
                        }
                    }
                }
                this.N = 0;
                this.O = 0;
            }
            EI2.f(this.P, 1, 3000, 100, "Accessibility.Android.Cache.MaxNodesInCache");
            EI2.l((int) (((this.Q * 1.0d) / (this.R + r0)) * 100.0d), "Accessibility.Android.Cache.PercentageRetrievedFromCache");
            this.P = 0;
            this.Q = 0;
            this.R = 0;
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onAttachedToWindow() {
        AccessibilityManager accessibilityManager = this.h;
        accessibilityManager.addAccessibilityStateChangeListener(this);
        E(accessibilityManager.isEnabled());
        CaptioningController captioningController = this.w;
        XF xf = captioningController.a;
        YF yf = xf.a;
        if (!(!yf.i.isEmpty())) {
            xf.b.addCaptioningChangeListener(xf);
            xf.b();
        }
        yf.i.put(captioningController, null);
        yf.b(captioningController);
        x();
    }

    public final void x() {
        if (t()) {
            try {
                V60.a.registerReceiver(this.K, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
            } catch (ReceiverCallNotAllowedException unused) {
            }
            this.f11538J = Locale.getDefault().toLanguageTag();
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        M0 m0 = this.g;
        if (m0.b() != null) {
            C10191tp4.e(m0.b()).a.d(this);
            K44 x = ((WebContentsImpl) m0.b()).x();
            if (x != null) {
                x.c(WebContentsAccessibilityImpl.class);
            }
        }
        long j = this.k;
        if (j != 0) {
            N.MxGfnb$m(j);
        }
    }

    @Override // defpackage.J44
    public final void destroy() {
        if (this.g.b() == null) {
            long j = this.k;
            if (j != 0) {
                N.MxGfnb$m(j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.accessibility.AccessibilityNodeProvider o() {
        /*
            r4 = this;
            boolean r0 = r4.F
            r1 = 0
            if (r0 == 0) goto L6
            goto L44
        L6:
            boolean r0 = r4.t()
            if (r0 != 0) goto L26
            boolean r0 = r4.C
            if (r0 != 0) goto L11
            goto L44
        L11:
            M0 r0 = r4.g
            org.chromium.content_public.browser.WebContents r2 = r0.b()
            if (r2 == 0) goto L44
            org.chromium.content_public.browser.WebContents r0 = r0.b()
            long r2 = J.N.MjYAnP1s(r4, r0)
            r4.k = r2
            r4.v()
        L26:
            boolean r0 = r4.t()
            if (r0 == 0) goto L33
            long r2 = r4.k
            boolean r0 = J.N.Mr9fGid2(r2)
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != 0) goto L46
            boolean r0 = org.chromium.content.browser.accessibility.BrowserAccessibilityState.a
            if (r0 != 0) goto L3d
            org.chromium.content.browser.accessibility.BrowserAccessibilityState.b()
        L3d:
            boolean r0 = org.chromium.content.browser.accessibility.BrowserAccessibilityState.f
            long r2 = r4.k
            J.N.Mg$cuhZc(r2, r0)
        L44:
            r0 = r1
            goto L47
        L46:
            r0 = r4
        L47:
            if (r0 != 0) goto L4a
            return r1
        L4a:
            java.lang.Object r0 = r0.a
            android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.o():android.view.accessibility.AccessibilityNodeProvider");
    }

    public String generateAccessibilityNodeInfoString(int i) {
        this.r = true;
        AccessibilityNodeInfoCompat d = d(i);
        String str = "";
        if (d != null) {
            StringBuilder sb = new StringBuilder();
            AccessibilityNodeInfo accessibilityNodeInfo = d.a;
            String[] split = accessibilityNodeInfo.getClassName().toString().split("\\.");
            sb.append(split[split.length - 1]);
            if (d.i() == null) {
                sb.append(" text:\"null\"");
            } else if (!d.i().toString().isEmpty()) {
                sb.append(" text:\"");
                sb.append(d.i().toString().replace("\n", "\\n"));
                sb.append("\"");
            }
            if (d.g() != null && !d.g().toString().isEmpty()) {
                sb.append(" hint:\"");
                sb.append(d.g());
                sb.append("\"");
            }
            if (d.e() != null) {
                sb.append(" contentDescription:\"");
                sb.append(d.e().toString().replace("\n", "\\n"));
                sb.append("\"");
            }
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 28 ? accessibilityNodeInfo.getPaneTitle() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY")) != null) {
                sb.append(" paneTitle:\"");
                sb.append(i2 >= 28 ? accessibilityNodeInfo.getPaneTitle() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"));
                sb.append("\"");
            }
            if (accessibilityNodeInfo.getViewIdResourceName() != null) {
                sb.append(" viewIdResName:\"");
                sb.append(accessibilityNodeInfo.getViewIdResourceName());
                sb.append("\"");
            }
            if (accessibilityNodeInfo.getError() != null) {
                sb.append(" error:\"");
                sb.append(accessibilityNodeInfo.getError());
                sb.append("\"");
            }
            if (d.h() != null && !d.h().toString().isEmpty()) {
                sb.append(" stateDescription:\"");
                sb.append(d.h());
                sb.append("\"");
            }
            if (accessibilityNodeInfo.canOpenPopup()) {
                sb.append(" canOpenPopUp");
            }
            if (accessibilityNodeInfo.isCheckable()) {
                sb.append(" checkable");
            }
            if (accessibilityNodeInfo.isChecked()) {
                sb.append(" checked");
            }
            if (accessibilityNodeInfo.isClickable()) {
                sb.append(" clickable");
            }
            if (accessibilityNodeInfo.isContentInvalid()) {
                sb.append(" contentInvalid");
            }
            if (accessibilityNodeInfo.isDismissable()) {
                sb.append(" dismissable");
            }
            if (accessibilityNodeInfo.isEditable()) {
                sb.append(" editable");
            }
            if (!accessibilityNodeInfo.isEnabled()) {
                sb.append(" disabled");
            }
            if (accessibilityNodeInfo.isFocusable()) {
                sb.append(" focusable");
            }
            if (accessibilityNodeInfo.isFocused()) {
                sb.append(" focused");
            }
            if (accessibilityNodeInfo.isMultiLine()) {
                sb.append(" multiLine");
            }
            if (accessibilityNodeInfo.isPassword()) {
                sb.append(" password");
            }
            if (accessibilityNodeInfo.isScrollable()) {
                sb.append(" scrollable");
            }
            if (accessibilityNodeInfo.isSelected()) {
                sb.append(" selected");
            }
            if (!accessibilityNodeInfo.isVisibleToUser()) {
                sb.append(" notVisibleToUser");
            }
            if (accessibilityNodeInfo.getInputType() != 0) {
                sb.append(" inputType:");
                sb.append(accessibilityNodeInfo.getInputType());
            }
            if (accessibilityNodeInfo.getTextSelectionStart() != -1) {
                sb.append(" textSelectionStart:");
                sb.append(accessibilityNodeInfo.getTextSelectionStart());
            }
            if (accessibilityNodeInfo.getTextSelectionEnd() != -1) {
                sb.append(" textSelectionEnd:");
                sb.append(accessibilityNodeInfo.getTextSelectionEnd());
            }
            if (accessibilityNodeInfo.getMaxTextLength() != -1) {
                sb.append(" maxTextLength:");
                sb.append(accessibilityNodeInfo.getMaxTextLength());
            }
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if ((collectionInfo != null ? new C6136i1(collectionInfo) : null) != null) {
                sb.append(" CollectionInfo:");
                AccessibilityNodeInfo.CollectionInfo collectionInfo2 = accessibilityNodeInfo.getCollectionInfo();
                C6136i1 c6136i1 = collectionInfo2 != null ? new C6136i1(collectionInfo2) : null;
                String str2 = ((AccessibilityNodeInfo.CollectionInfo) c6136i1.a).isHierarchical() ? "[hierarchical, " : "[";
                AccessibilityNodeInfo.CollectionInfo collectionInfo3 = (AccessibilityNodeInfo.CollectionInfo) c6136i1.a;
                sb.append(String.format("%srows=%s, cols=%s]", str2, Integer.valueOf(collectionInfo3.getRowCount()), Integer.valueOf(collectionInfo3.getColumnCount())));
            }
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if ((collectionItemInfo != null ? new C6478j1(collectionItemInfo) : null) != null) {
                sb.append(" CollectionItemInfo:");
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = accessibilityNodeInfo.getCollectionItemInfo();
                C6478j1 c6478j1 = collectionItemInfo2 != null ? new C6478j1(collectionItemInfo2) : null;
                String str3 = ((AccessibilityNodeInfo.CollectionItemInfo) c6478j1.a).isHeading() ? "[heading, " : "[";
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo3 = (AccessibilityNodeInfo.CollectionItemInfo) c6478j1.a;
                if (collectionItemInfo3.isSelected()) {
                    str3 = str3.concat("selected, ");
                }
                sb.append(String.format("%srowIndex=%s, rowSpan=%s, colIndex=%s, colSpan=%s]", str3, Integer.valueOf(collectionItemInfo3.getRowIndex()), Integer.valueOf(collectionItemInfo3.getRowSpan()), Integer.valueOf(collectionItemInfo3.getColumnIndex()), Integer.valueOf(collectionItemInfo3.getColumnSpan())));
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
            if ((rangeInfo != null ? new C6822k1(rangeInfo) : null) != null) {
                sb.append(" RangeInfo:");
                AccessibilityNodeInfo.RangeInfo rangeInfo2 = accessibilityNodeInfo.getRangeInfo();
                C6822k1 c6822k1 = rangeInfo2 != null ? new C6822k1(rangeInfo2) : null;
                AccessibilityNodeInfo.RangeInfo rangeInfo3 = (AccessibilityNodeInfo.RangeInfo) c6822k1.a;
                sb.append(String.format("[current=%s, min=%s, max=%s]", Float.valueOf(((AccessibilityNodeInfo.RangeInfo) c6822k1.a).getCurrent()), Float.valueOf(rangeInfo3.getMin()), Float.valueOf(rangeInfo3.getMax())));
            }
            sb.append(" actions:");
            List<C5792h1> d2 = d.d();
            Collections.sort(d2, new Comparator() { // from class: l1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((C5792h1) obj).a(), ((C5792h1) obj2).a());
                }
            });
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder("[");
            for (C5792h1 c5792h1 : d2) {
                if (!c5792h1.equals(C5792h1.m) && !c5792h1.equals(C5792h1.n) && !c5792h1.equals(C5792h1.y) && !c5792h1.equals(C5792h1.H)) {
                    int a = c5792h1.a();
                    arrayList.add(a == C5792h1.k.a() ? "NEXT" : a == C5792h1.l.a() ? "PREVIOUS" : a == C5792h1.x.a() ? "SET_TEXT" : a == C5792h1.r.a() ? "PASTE" : a == C5792h1.f11510J.a() ? "IME_ENTER" : a == C5792h1.t.a() ? "SET_SELECTION" : a == C5792h1.s.a() ? "CUT" : a == C5792h1.q.a() ? "COPY" : a == C5792h1.o.a() ? "SCROLL_FORWARD" : a == C5792h1.p.a() ? "SCROLL_BACKWARD" : a == C5792h1.z.a() ? "SCROLL_UP" : a == C5792h1.D.a() ? "PAGE_UP" : a == C5792h1.B.a() ? "SCROLL_DOWN" : a == C5792h1.E.a() ? "PAGE_DOWN" : a == C5792h1.A.a() ? "SCROLL_LEFT" : a == C5792h1.F.a() ? "PAGE_LEFT" : a == C5792h1.C.a() ? "SCROLL_RIGHT" : a == C5792h1.G.a() ? "PAGE_RIGHT" : a == C5792h1.f.a() ? "CLEAR_FOCUS" : a == C5792h1.e.a() ? "FOCUS" : a == C5792h1.j.a() ? "CLEAR_AX_FOCUS" : a == C5792h1.i.a() ? "AX_FOCUS" : a == C5792h1.g.a() ? "CLICK" : a == C5792h1.u.a() ? "EXPAND" : a == C5792h1.v.a() ? "COLLAPSE" : a == C5792h1.I.a() ? "SET_PROGRESS" : "NOT_IMPLEMENTED");
                }
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            sb.append(sb2.toString());
            sb.append(" bundle:");
            Bundle f = d.f();
            ArrayList arrayList2 = new ArrayList(f.keySet());
            Collections.sort(arrayList2, String.CASE_INSENSITIVE_ORDER);
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb3 = new StringBuilder("[");
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (!str4.equals("AccessibilityNodeInfo.unclippedTop") && !str4.equals("AccessibilityNodeInfo.unclippedBottom") && f.get(str4) != null && !f.get(str4).toString().isEmpty() && !str4.equals("ACTION_ARGUMENT_HTML_ELEMENT_STRING_VALUES") && !str4.equals("AccessibilityNodeInfo.offscreen") && !str4.contains("AccessibilityNodeInfoCompat")) {
                    arrayList3.add(str4.replace("AccessibilityNodeInfo.", "") + "=\"" + f.get(str4).toString() + "\"");
                }
            }
            sb3.append(TextUtils.join(", ", arrayList3));
            sb3.append("]");
            sb.append(sb3.toString());
            str = sb.toString();
        }
        this.r = false;
        return str;
    }

    public void updateMaxNodesInCache() {
        this.P = Math.max(this.P, this.H.size());
    }

    public void clearNodeInfoCacheForGivenId(int i) {
        SparseArray sparseArray = this.H;
        if (sparseArray.get(i) != null) {
            ((AccessibilityNodeInfoCompat) sparseArray.get(i)).a.recycle();
            sparseArray.remove(i);
        }
        this.S.remove(Integer.valueOf(i));
    }

    @Override // defpackage.C8541p1
    public final AccessibilityNodeInfoCompat d(int i) {
        if (!q()) {
            return null;
        }
        int MI8pU34f = N.MI8pU34f(this.k);
        View view = this.o;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
            AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain2);
            Rect rect = new Rect();
            obtain2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.l(rect);
            obtain2.getBoundsInScreen(rect);
            obtain.setBoundsInScreen(rect);
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.b = -1;
                obtain.setParent((View) parentForAccessibility);
            }
            obtain.setVisibleToUser(obtain2.isVisibleToUser());
            obtain.setEnabled(obtain2.isEnabled());
            obtain.setPackageName(obtain2.getPackageName());
            accessibilityNodeInfoCompat.m(obtain2.getClassName());
            if (s()) {
                obtain.addChild(view, MI8pU34f);
            }
            return accessibilityNodeInfoCompat;
        }
        if (!s()) {
            return null;
        }
        SparseArray sparseArray = this.H;
        if (sparseArray.get(i) != null) {
            AccessibilityNodeInfo obtain3 = AccessibilityNodeInfo.obtain(((AccessibilityNodeInfoCompat) sparseArray.get(i)).a);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(obtain3);
            if (!N.MZ7sDynr(this.k, accessibilityNodeInfoCompat2, i)) {
                ((AccessibilityNodeInfoCompat) sparseArray.get(i)).a.recycle();
                sparseArray.remove(i);
                return null;
            }
            obtain3.setAccessibilityFocused(this.t == i);
            if (this.t == i) {
                accessibilityNodeInfoCompat2.b(C5792h1.j);
                accessibilityNodeInfoCompat2.j(C5792h1.i);
            } else {
                accessibilityNodeInfoCompat2.j(C5792h1.j);
                accessibilityNodeInfoCompat2.b(C5792h1.i);
            }
            this.Q++;
            return accessibilityNodeInfoCompat2;
        }
        AccessibilityNodeInfo obtain4 = AccessibilityNodeInfo.obtain(view);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = new AccessibilityNodeInfoCompat(obtain4);
        obtain4.setPackageName(this.i.getPackageName());
        accessibilityNodeInfoCompat3.c = i;
        obtain4.setSource(view, i);
        if (i == MI8pU34f) {
            accessibilityNodeInfoCompat3.b = -1;
            obtain4.setParent(view);
        }
        if (!N.MJGtghd9(this.k, accessibilityNodeInfoCompat3, i)) {
            obtain4.recycle();
            return null;
        }
        sparseArray.put(i, new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(obtain4)));
        this.R++;
        return accessibilityNodeInfoCompat3;
    }

    public void setAccessibilityNodeInfoCollectionInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, boolean z) {
        AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
        accessibilityNodeInfoCompat.getClass();
        accessibilityNodeInfoCompat.a.setCollectionInfo(obtain);
    }

    @Override // defpackage.C8541p1
    public final List e() {
        return new ArrayList();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        E(z);
    }

    public final void C(boolean z) {
        if (z != this.F) {
            this.F = z;
            A(-1, 2048);
        }
    }

    public final void E(boolean z) {
        if (!z) {
            this.C = false;
            this.G = false;
        } else {
            this.C = true;
            this.G = this.h.isTouchExplorationEnabled();
        }
    }

    public void setAccessibilityNodeInfoCollectionItemInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3, int i4, boolean z) {
        AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
        accessibilityNodeInfoCompat.getClass();
        accessibilityNodeInfoCompat.a.setCollectionItemInfo(obtain);
    }

    public final void w(ViewStructure viewStructure) {
        M0 m0 = this.g;
        if (m0.isIncognito()) {
            viewStructure.setChildCount(0);
            return;
        }
        viewStructure.setChildCount(1);
        ViewStructure asyncNewChild = viewStructure.asyncNewChild(0);
        asyncNewChild.setClassName("");
        asyncNewChild.setHint(this.j);
        WebContents b = m0.b();
        if (b != null && !b.isDestroyed()) {
            asyncNewChild.getExtras().putCharSequence("url", b.u().i());
        }
        m0.j(asyncNewChild, new RunnableC9481rl4(asyncNewChild));
    }

    @Override // defpackage.C8541p1
    public final boolean h(int i, int i2, Bundle bundle) {
        int i3;
        CharSequence charSequence;
        String string;
        String string2;
        int i4 = 0;
        if (!q() || !N.MTBNGzHX(this.k, i)) {
            return false;
        }
        boolean z = true;
        if (i2 == C5792h1.i.a()) {
            if (!u(i)) {
                return true;
            }
            if (this.l) {
                this.p = true;
            } else {
                z(this.t);
            }
            return true;
        }
        if (i2 == C5792h1.j.a()) {
            A(i, 65536);
            int i5 = this.t;
            if (i5 == i) {
                N.MPQKLw45(this.k, i5, -1);
                this.t = -1;
            }
            int i6 = this.m;
            if (i6 == i) {
                A(i6, 256);
                this.m = -1;
            }
            return true;
        }
        int a = C5792h1.g.a();
        M0 m0 = this.g;
        View view = this.o;
        if (i2 == a) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            int[] MihzIy2h = N.MihzIy2h(this.k, i);
            if (!m0.f(MihzIy2h != null ? new Rect(MihzIy2h[0], MihzIy2h[1], MihzIy2h[2], MihzIy2h[3]) : null)) {
                N.MM4OAOXm(this.k, i);
            }
            return true;
        }
        if (i2 == C5792h1.e.a()) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            N.MG_OiJKg(this.k, i);
            return true;
        }
        if (i2 == C5792h1.f.a()) {
            N.MNm00fYN(this.k);
            return true;
        }
        if (i2 == C5792h1.m.a()) {
            if (bundle == null || (string2 = bundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING")) == null) {
                return false;
            }
            String upperCase = string2.toUpperCase(Locale.US);
            int MavOU0SM = N.MavOU0SM(this.k, i, upperCase, true, false, upperCase.isEmpty());
            if (MavOU0SM == 0) {
                return false;
            }
            u(MavOU0SM);
            z(this.t);
            return true;
        }
        if (i2 == C5792h1.n.a()) {
            if (bundle == null || (string = bundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING")) == null) {
                return false;
            }
            String upperCase2 = string.toUpperCase(Locale.US);
            int MavOU0SM2 = N.MavOU0SM(this.k, i, upperCase2, false, i == this.n, upperCase2.isEmpty());
            if (MavOU0SM2 == 0) {
                return false;
            }
            u(MavOU0SM2);
            z(this.t);
            return true;
        }
        if (i2 == C5792h1.x.a()) {
            if (!N.MCMbXu4W(this.k, i) || bundle == null || (charSequence = bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) == null) {
                return false;
            }
            String charSequence2 = charSequence.toString();
            N.MEJD7Boi(this.k, i, charSequence2);
            N.MVuu0R4P(this.k, i, charSequence2.length(), charSequence2.length());
            return true;
        }
        if (i2 == C5792h1.t.a()) {
            if (!N.MCMbXu4W(this.k, i)) {
                return false;
            }
            if (bundle != null) {
                i4 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
                i3 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
            } else {
                i3 = 0;
            }
            N.MVuu0R4P(this.k, i, i4, i3);
            return true;
        }
        if (i2 == C5792h1.k.a()) {
            if (bundle == null) {
                return false;
            }
            int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            if (i7 != 1 && i7 != 2 && i7 != 4) {
                z = false;
            }
            if (!z || i != this.u) {
                return false;
            }
            B(i7);
            return (z2 && this.x) ? N.McKjfBnu(this.k, this.s, z2, i, this.z) : N.McKjfBnu(this.k, this.s, z2, i, this.y);
        }
        if (i2 == C5792h1.l.a()) {
            if (bundle == null) {
                return false;
            }
            int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            if (i8 != 1 && i8 != 2 && i8 != 4) {
                z = false;
            }
            if (!z || i != this.u) {
                return false;
            }
            B(i8);
            return N.M3suD0ji(this.k, this.s, z3, i, this.z);
        }
        if (i2 == C5792h1.o.a()) {
            return N.MkaakTGI(this.k, i) ? N.MLjXc4lw(this.k, i, true) : N.MNch0m9c(this.k, i, 0, false);
        }
        if (i2 == C5792h1.p.a()) {
            return N.MkaakTGI(this.k, i) ? N.MLjXc4lw(this.k, i, false) : N.MNch0m9c(this.k, i, 1, false);
        }
        if (i2 == C5792h1.s.a()) {
            if (m0.b() == null) {
                return false;
            }
            WebContentsImpl webContentsImpl = (WebContentsImpl) m0.b();
            webContentsImpl.q();
            N.MhIiCaN7(webContentsImpl.g);
            return true;
        }
        if (i2 == C5792h1.q.a()) {
            if (m0.b() == null) {
                return false;
            }
            WebContentsImpl webContentsImpl2 = (WebContentsImpl) m0.b();
            webContentsImpl2.q();
            N.MpfMxfut(webContentsImpl2.g);
            return true;
        }
        if (i2 == C5792h1.r.a()) {
            if (m0.b() == null) {
                return false;
            }
            WebContentsImpl webContentsImpl3 = (WebContentsImpl) m0.b();
            webContentsImpl3.q();
            N.MYRJ_nNk(webContentsImpl3.g);
            return true;
        }
        if (i2 == C5792h1.v.a() || i2 == C5792h1.u.a()) {
            int[] MihzIy2h2 = N.MihzIy2h(this.k, i);
            if (!m0.f(MihzIy2h2 != null ? new Rect(MihzIy2h2[0], MihzIy2h2[1], MihzIy2h2[2], MihzIy2h2[3]) : null)) {
                N.MM4OAOXm(this.k, i);
            }
            return true;
        }
        if (i2 == C5792h1.y.a()) {
            z(i);
            return true;
        }
        if (i2 == C5792h1.H.a() || i2 == C5792h1.h.a()) {
            N.MOikWIf9(this.k, i);
            return true;
        }
        if (i2 == C5792h1.z.a() || i2 == C5792h1.D.a()) {
            return N.MNch0m9c(this.k, i, 2, i2 == C5792h1.D.a());
        }
        if (i2 == C5792h1.B.a() || i2 == C5792h1.E.a()) {
            return N.MNch0m9c(this.k, i, 3, i2 == C5792h1.E.a());
        }
        if (i2 == C5792h1.A.a() || i2 == C5792h1.F.a()) {
            return N.MNch0m9c(this.k, i, 4, i2 == C5792h1.F.a());
        }
        if (i2 == C5792h1.C.a() || i2 == C5792h1.G.a()) {
            return N.MNch0m9c(this.k, i, 5, i2 == C5792h1.G.a());
        }
        if (i2 == C5792h1.I.a()) {
            if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return N.MfTAAcu8(this.k, i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            }
            return false;
        }
        if (i2 != C5792h1.f11510J.a() || m0.b() == null || ImeAdapterImpl.b(m0.b()) == null) {
            return false;
        }
        return ImeAdapterImpl.b(m0.b()).i(0);
    }

    public void setAccessibilityNodeInfoRangeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, float f, float f2, float f3) {
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
        accessibilityNodeInfoCompat.getClass();
        accessibilityNodeInfoCompat.a.setRangeInfo(obtain);
    }

    public final boolean onHoverEvent(int i) {
        if (!q()) {
            return false;
        }
        if (i == 10) {
            this.l = false;
            return true;
        }
        this.l = true;
        return true;
    }

    public final void notifyFrameInfoInitialized() {
        int i;
        if (this.q) {
            return;
        }
        this.q = true;
        A(-1, 2048);
        if (this.D && (i = this.t) != -1) {
            A(i, 65536);
            this.t = -1;
            u(i);
        }
    }

    public final void B(int i) {
        this.s = i;
        if (N.MCMbXu4W(this.k, this.t) && N.M8UuMlLD(this.k, this.t)) {
            if (this.y == -1) {
                this.y = N.MnVi6Frs(this.k, this.t);
            }
            if (this.z == -1) {
                this.z = N.Mxt_kc4Q(this.k, this.t);
            }
        }
    }

    public final void finishGranularityMoveNext(String str, boolean z, int i, int i2) {
        AccessibilityEvent i3 = i(this.u, 8192);
        if (i3 == null) {
            return;
        }
        AccessibilityEvent i4 = i(this.u, 131072);
        if (i4 == null) {
            i3.recycle();
            return;
        }
        if (z) {
            if (!this.x) {
                this.x = true;
                this.y = i;
            }
            i3.setFromIndex(this.y);
            i3.setToIndex(i2);
        } else {
            this.x = false;
            this.y = i2;
            i3.setFromIndex(i2);
            i3.setToIndex(i2);
        }
        this.z = i2;
        i3.setItemCount(str.length());
        D(i3);
        i4.setFromIndex(i);
        i4.setToIndex(i2);
        i4.setItemCount(str.length());
        i4.setMovementGranularity(this.s);
        i4.setContentDescription(str);
        i4.setAction(C5792h1.k.a());
        y(i3);
        y(i4);
        this.B = true;
    }

    public final void finishGranularityMovePrevious(String str, boolean z, int i, int i2) {
        AccessibilityEvent i3 = i(this.u, 8192);
        if (i3 == null) {
            return;
        }
        AccessibilityEvent i4 = i(this.u, 131072);
        if (i4 == null) {
            i3.recycle();
            return;
        }
        if (z) {
            if (!this.x) {
                this.x = true;
                this.y = i2;
            }
            i3.setFromIndex(this.y);
            i3.setToIndex(i);
        } else {
            this.x = false;
            this.y = i;
            i3.setFromIndex(i);
            i3.setToIndex(i);
        }
        this.z = i;
        i3.setItemCount(str.length());
        D(i3);
        i4.setFromIndex(i);
        i4.setToIndex(i2);
        i4.setItemCount(str.length());
        i4.setMovementGranularity(this.s);
        i4.setContentDescription(str);
        i4.setAction(C5792h1.l.a());
        y(i3);
        y(i4);
        this.B = true;
    }

    public final void D(AccessibilityEvent accessibilityEvent) {
        if (N.MCMbXu4W(this.k, this.u) && N.M8UuMlLD(this.k, this.u)) {
            N.MVuu0R4P(this.k, this.u, accessibilityEvent.getFromIndex(), accessibilityEvent.getToIndex());
        }
    }

    public final boolean u(int i) {
        int i2 = this.t;
        if (i == i2) {
            return false;
        }
        N.MPQKLw45(this.k, i2, i);
        this.t = i;
        this.u = i;
        this.s = 0;
        this.x = false;
        this.y = -1;
        this.z = N.MhMiVz6m(this.k, i);
        this.B = false;
        if (N.M5uHFthk(this.k, this.t)) {
            this.v.requestFocus();
        }
        A(this.t, 32768);
        return true;
    }

    public final void sendDelayedWindowContentChangedEvent() {
        A(-1, 2048);
    }

    public final void A(final int i, final int i2) {
        if (i == -1) {
            this.o.sendAccessibilityEvent(i2);
            return;
        }
        if (this.B && i2 == 8192) {
            this.B = false;
            return;
        }
        this.N++;
        final Q0 q0 = this.I;
        if (!q0.g || q0.c.contains(Integer.valueOf(i2))) {
            Integer valueOf = Integer.valueOf(i2);
            boolean containsKey = q0.a.containsKey(valueOf);
            C8796pl4 c8796pl4 = q0.f;
            if (!containsKey) {
                c8796pl4.a(i, i2);
                return;
            }
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            final long j = q0.b.contains(Integer.valueOf(i2)) ? i2 : (i << 32) | i2;
            HashMap hashMap = q0.d;
            Object obj = hashMap.get(Long.valueOf(j));
            HashMap hashMap2 = q0.e;
            if (obj == null || timeInMillis - ((Long) hashMap.get(Long.valueOf(j))).longValue() >= ((Integer) r8.get(Integer.valueOf(i2))).intValue()) {
                if (c8796pl4.a(i, i2)) {
                    hashMap.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                }
                c8796pl4.a.o.removeCallbacks((Runnable) hashMap2.get(Long.valueOf(j)));
                hashMap2.remove(Long.valueOf(j));
                return;
            }
            c8796pl4.a.o.removeCallbacks((Runnable) hashMap2.get(Long.valueOf(j)));
            Runnable runnable = new Runnable() { // from class: P0
                @Override // java.lang.Runnable
                public final void run() {
                    Q0 q02 = Q0.this;
                    C8796pl4 c8796pl42 = q02.f;
                    boolean a = c8796pl42.a(i, i2);
                    long j2 = j;
                    if (a) {
                        q02.d.put(Long.valueOf(j2), Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                    }
                    HashMap hashMap3 = q02.e;
                    c8796pl42.a.o.removeCallbacks((Runnable) hashMap3.get(Long.valueOf(j2)));
                    hashMap3.remove(Long.valueOf(j2));
                }
            };
            c8796pl4.a.o.postDelayed(runnable, (((Long) hashMap.get(Long.valueOf(j))).longValue() + ((Integer) r8.get(Integer.valueOf(i2))).intValue()) - timeInMillis);
            hashMap2.put(Long.valueOf(j), runnable);
        }
    }

    public final AccessibilityEvent i(int i, int i2) {
        if (!q() || !s() || !N.MTBNGzHX(this.k, i)) {
            return null;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setPackageName(this.i.getPackageName());
        obtain.setSource(this.o, i);
        if (i2 == 2048) {
            obtain.setContentChangeTypes(1);
        }
        if (N.M2E1dEU9(this.k, obtain, i, i2)) {
            return obtain;
        }
        obtain.recycle();
        return null;
    }

    public final boolean q() {
        return t() && (this.r || this.h.isEnabled());
    }

    public final boolean s() {
        M0 m0 = this.g;
        if (m0.b() == null && this.k == 0) {
            return true;
        }
        L0 k = m0.k();
        return (((double) k.f()) == 0.0d && ((double) k.a()) == 0.0d) ? false : true;
    }

    public final void handleFocusChanged(int i) {
        if (this.D || this.t != -1) {
            A(i, 8);
            u(i);
        }
    }

    public final void handleCheckStateChanged(int i) {
        if (this.t == i) {
            A(i, 1);
        }
    }

    public final void handleStateDescriptionChanged(int i) {
        AccessibilityEvent obtain;
        if (!q() || (obtain = AccessibilityEvent.obtain(2048)) == null) {
            return;
        }
        obtain.setContentChangeTypes(64);
        obtain.setSource(this.o, i);
        y(obtain);
    }

    public final void handleClicked(int i) {
        A(i, 1);
    }

    public final void handleTextSelectionChanged(int i) {
        A(i, 8192);
    }

    public final void handleTextContentChanged(int i) {
        AccessibilityEvent i2 = i(i, 2048);
        if (i2 != null) {
            i2.setContentChangeTypes(2);
            y(i2);
        }
    }

    public final void handleEditableTextChanged(int i) {
        A(i, 16);
    }

    public final void handleSliderChanged(int i) {
        if (this.t == i) {
            A(i, 4);
        } else {
            A(i, 4096);
        }
    }

    public final void handleContentChanged(int i) {
        int MI8pU34f = N.MI8pU34f(this.k);
        if (MI8pU34f != this.n) {
            this.n = MI8pU34f;
            A(-1, 2048);
        } else {
            A(i, 2048);
        }
    }

    public final void handleNavigate() {
        this.t = -1;
        A(-1, 2048);
    }

    public void handleScrollPositionChanged(int i) {
        A(i, 4096);
        if (this.p) {
            A(i, 2048);
            this.p = false;
        }
    }

    public final void handleScrolledToAnchor(int i) {
        u(i);
    }

    public final void handleHover(int i) {
        if (this.m != i && this.l) {
            A(i, 128);
            if (this.g.h() != 0) {
                if (i == this.t) {
                    A(i, 65536);
                    this.t = -1;
                }
                u(i);
            }
        }
    }

    public void handleDialogModalOpened(int i) {
        AccessibilityEvent obtain;
        if (!q() || (obtain = AccessibilityEvent.obtain(32)) == null) {
            return;
        }
        obtain.setContentChangeTypes(16);
        obtain.setSource(this.o, i);
        y(obtain);
    }

    public final void announceLiveRegionText(String str) {
        AccessibilityEvent obtain;
        if (!q() || (obtain = AccessibilityEvent.obtain(16384)) == null) {
            return;
        }
        obtain.getText().add(str);
        obtain.setContentDescription(null);
        y(obtain);
    }

    public final void addAccessibilityNodeInfoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int[] iArr) {
        for (int i : iArr) {
            accessibilityNodeInfoCompat.a.addChild(this.o, i);
        }
    }

    public final void addAccessibilityNodeInfoActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        accessibilityNodeInfoCompat.b(C5792h1.m);
        accessibilityNodeInfoCompat.b(C5792h1.n);
        accessibilityNodeInfoCompat.b(C5792h1.y);
        accessibilityNodeInfoCompat.b(C5792h1.H);
        if (z15) {
            accessibilityNodeInfoCompat.b(C5792h1.k);
            accessibilityNodeInfoCompat.b(C5792h1.l);
        }
        if (z8 && z9) {
            accessibilityNodeInfoCompat.b(C5792h1.x);
            accessibilityNodeInfoCompat.b(C5792h1.r);
            accessibilityNodeInfoCompat.b(C5792h1.f11510J);
            if (z14) {
                accessibilityNodeInfoCompat.b(C5792h1.t);
                accessibilityNodeInfoCompat.b(C5792h1.s);
                accessibilityNodeInfoCompat.b(C5792h1.q);
            }
        }
        if (z) {
            accessibilityNodeInfoCompat.b(C5792h1.o);
        }
        if (z2) {
            accessibilityNodeInfoCompat.b(C5792h1.p);
        }
        if (z3) {
            accessibilityNodeInfoCompat.b(C5792h1.z);
            accessibilityNodeInfoCompat.b(C5792h1.D);
        }
        if (z4) {
            accessibilityNodeInfoCompat.b(C5792h1.B);
            accessibilityNodeInfoCompat.b(C5792h1.E);
        }
        if (z5) {
            accessibilityNodeInfoCompat.b(C5792h1.A);
            accessibilityNodeInfoCompat.b(C5792h1.F);
        }
        if (z6) {
            accessibilityNodeInfoCompat.b(C5792h1.C);
            accessibilityNodeInfoCompat.b(C5792h1.G);
        }
        if (z10) {
            if (z11) {
                accessibilityNodeInfoCompat.b(C5792h1.f);
            } else {
                accessibilityNodeInfoCompat.b(C5792h1.e);
            }
        }
        if (this.t == i) {
            accessibilityNodeInfoCompat.b(C5792h1.j);
        } else {
            accessibilityNodeInfoCompat.b(C5792h1.i);
        }
        if (z7) {
            accessibilityNodeInfoCompat.b(C5792h1.g);
        }
        if (z12) {
            accessibilityNodeInfoCompat.b(C5792h1.u);
        }
        if (z13) {
            accessibilityNodeInfoCompat.b(C5792h1.v);
        }
        if (z16) {
            accessibilityNodeInfoCompat.b(C5792h1.I);
        }
    }

    public final void setAccessibilityNodeInfoBaseAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i, int i2, String str6, int i3) {
        accessibilityNodeInfoCompat.m(str);
        Bundle f = accessibilityNodeInfoCompat.f();
        f.putCharSequence("AccessibilityNodeInfo.chromeRole", str2);
        f.putCharSequence("AccessibilityNodeInfo.roleDescription", str3);
        f.putCharSequence("AccessibilityNodeInfo.hint", str4);
        if (!str5.isEmpty()) {
            f.putCharSequence("AccessibilityNodeInfo.targetUrl", str5);
        }
        if (z) {
            f.putCharSequence("ACTION_ARGUMENT_HTML_ELEMENT_STRING_VALUES", this.A);
        }
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setCanOpenPopup(z2);
        accessibilityNodeInfo.setDismissable(false);
        accessibilityNodeInfo.setMultiLine(z3);
        accessibilityNodeInfo.setInputType(i);
        if (accessibilityNodeInfo.isContentInvalid()) {
            accessibilityNodeInfo.setError(str6);
        }
        if (i3 > 0) {
            f.putInt("AccessibilityNodeInfo.clickableScore", i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, androidx.core.view.accessibility.AccessibilityNodeInfoCompat] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.SpannableString] */
    public void setAccessibilityNodeInfoText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, boolean z, boolean z2, String str2, int[] iArr, int[] iArr2, String[] strArr, String str3) {
        CharSequence charSequence;
        SpannableString spannableString;
        if (z) {
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
            charSequence = spannableString2;
        } else {
            charSequence = str;
        }
        ?? r6 = charSequence;
        if (!str2.isEmpty()) {
            r6 = charSequence;
            if (!str2.equals(this.f11538J)) {
                if (charSequence instanceof SpannableString) {
                    spannableString = (SpannableString) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(str2)), 0, spannableString.length(), 0);
                r6 = spannableString;
            }
        }
        if (iArr != null && iArr.length > 0) {
            if (r6 instanceof SpannableString) {
                r6 = (SpannableString) r6;
            } else {
                r6 = new SpannableString(r6);
            }
            int length = r6.length();
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 >= 0 && i2 <= length && i3 >= 0 && i3 <= length && i2 <= i3) {
                    r6.setSpan(new SuggestionSpan(this.i, new String[]{strArr[i]}, 2), i2, i3, 0);
                }
            }
        }
        if (str3 != null && !str3.isEmpty()) {
            accessibilityNodeInfoCompat.getClass();
            boolean z3 = Build.VERSION.SDK_INT >= 30;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            if (z3) {
                accessibilityNodeInfo.setStateDescription(str3);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", str3);
            }
        }
        if (z) {
            accessibilityNodeInfoCompat.o(r6);
        } else {
            accessibilityNodeInfoCompat.r(r6);
        }
    }

    public final void j(Rect rect, Bundle bundle) {
        L0 k = this.g.k();
        rect.offset(-((int) k.b()), -((int) k.g()));
        rect.left = (int) k.e(rect.left);
        rect.top = (int) k.e(rect.top);
        rect.bottom = (int) k.e(rect.bottom);
        rect.right = (int) k.e(rect.right);
        rect.offset(0, (int) k.d());
        int[] iArr = new int[2];
        this.o.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        int d = iArr[1] + ((int) k.d());
        int c = k.c() + d;
        int i = rect.top;
        if (i < d) {
            bundle.putInt("AccessibilityNodeInfo.unclippedTop", i);
            rect.top = d;
        }
        int i2 = rect.bottom;
        if (i2 > c) {
            bundle.putInt("AccessibilityNodeInfo.unclippedBottom", i2);
            rect.bottom = c;
        }
    }

    public final void y(AccessibilityEvent accessibilityEvent) {
        View view = this.o;
        if (view.getParent() == null || !q()) {
            return;
        }
        this.O++;
        try {
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        } catch (IllegalStateException unused) {
        }
    }

    public final void z(int i) {
        int[] MihzIy2h = N.MihzIy2h(this.k, i);
        if (this.g.g(MihzIy2h == null ? null : new Rect(MihzIy2h[0], MihzIy2h[1], MihzIy2h[2], MihzIy2h[3]))) {
            return;
        }
        this.p = true;
        N.MB302_MP(this.k, i);
    }

    public void setAccessibilityNodeInfoLocation(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        Rect rect = new Rect(i4, i5, i4 + i6, i5 + i7);
        if (z) {
            rect.offset(0, (int) this.g.k().d());
        }
        accessibilityNodeInfoCompat.l(rect);
        Rect rect2 = new Rect(i2, i3, i6 + i2, i7 + i3);
        j(rect2, accessibilityNodeInfoCompat.f());
        accessibilityNodeInfoCompat.a.setBoundsInScreen(rect2);
        if (z2) {
            accessibilityNodeInfoCompat.f().putBoolean("AccessibilityNodeInfo.offscreen", true);
        } else if (accessibilityNodeInfoCompat.f().containsKey("AccessibilityNodeInfo.offscreen")) {
            accessibilityNodeInfoCompat.f().remove("AccessibilityNodeInfo.offscreen");
        }
    }

    public void setAccessibilityNodeInfoOAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, boolean z, boolean z2, String str) {
        accessibilityNodeInfoCompat.p(str);
        if (Build.VERSION.SDK_INT >= 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            if (z) {
                accessibilityNodeInfo.setAvailableExtraData(T);
            } else if (z2) {
                accessibilityNodeInfo.setAvailableExtraData(U);
            }
        }
    }

    public void setAccessibilityNodeInfoImageData(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, byte[] bArr) {
        accessibilityNodeInfoCompat.f().putByteArray("AccessibilityNodeInfo.imageData", bArr);
    }

    public final void setAccessibilityEventBaseAttributes(AccessibilityEvent accessibilityEvent, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, int i4, int i5, int i6, String str) {
        accessibilityEvent.setChecked(z);
        accessibilityEvent.setEnabled(z2);
        accessibilityEvent.setPassword(z3);
        accessibilityEvent.setScrollable(z4);
        accessibilityEvent.setCurrentItemIndex(i);
        accessibilityEvent.setItemCount(i2);
        accessibilityEvent.setScrollX(i3);
        accessibilityEvent.setScrollY(i4);
        accessibilityEvent.setMaxScrollX(i5);
        accessibilityEvent.setMaxScrollY(i6);
        accessibilityEvent.setClassName(str);
    }

    public final void setAccessibilityEventTextChangedAttrs(AccessibilityEvent accessibilityEvent, int i, int i2, int i3, String str, String str2) {
        accessibilityEvent.setFromIndex(i);
        accessibilityEvent.setAddedCount(i2);
        accessibilityEvent.setRemovedCount(i3);
        accessibilityEvent.setBeforeText(str);
        accessibilityEvent.getText().add(str2);
    }

    public final void setAccessibilityEventSelectionAttrs(AccessibilityEvent accessibilityEvent, int i, int i2, int i3, String str) {
        accessibilityEvent.setFromIndex(i);
        accessibilityEvent.setToIndex(i2);
        accessibilityEvent.setItemCount(i3);
        accessibilityEvent.getText().add(str);
    }

    @Override // defpackage.C8541p1
    public final void b(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        int[] MVBiMGvZ;
        str.getClass();
        if (!str.equals("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            if (str.equals("AccessibilityNodeInfo.requestImageData")) {
                HashSet hashSet = this.S;
                if (N.Mmo4i01Z(this.k, accessibilityNodeInfoCompat, i, hashSet.contains(Integer.valueOf(i)))) {
                    return;
                }
                hashSet.add(Integer.valueOf(i));
                return;
            }
            return;
        }
        if (!N.MZcfOSQW(this.k, i)) {
            N.M2WbOJ7$(this.k, i);
        }
        int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i3 <= 0 || i2 < 0 || (MVBiMGvZ = N.MVBiMGvZ(this.k, i, i2, i3)) == null) {
            return;
        }
        RectF[] rectFArr = new RectF[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 4;
            Rect rect = new Rect(MVBiMGvZ[i5 + 0], MVBiMGvZ[i5 + 1], MVBiMGvZ[i5 + 2], MVBiMGvZ[i5 + 3]);
            j(rect, accessibilityNodeInfoCompat.f());
            rectFArr[i4] = new RectF(rect);
        }
        accessibilityNodeInfoCompat.f().putParcelableArray("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY", rectFArr);
    }

    public final void setAccessibilityNodeInfoParent(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        accessibilityNodeInfoCompat.b = i;
        accessibilityNodeInfoCompat.a.setParent(this.o, i);
    }

    public final boolean r() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        String string = Settings.Secure.getString(this.i.getContentResolver(), "enabled_accessibility_services");
        return string == null || string.isEmpty();
    }

    public boolean shouldRespectDisplayedPasswordText() {
        return !r() && Build.VERSION.SDK_INT >= 26;
    }

    public boolean shouldExposePasswordText() {
        if (r()) {
            return true;
        }
        ContentResolver contentResolver = this.i.getContentResolver();
        return Build.VERSION.SDK_INT >= 26 ? Settings.System.getInt(contentResolver, "show_password", 1) == 1 : Settings.Secure.getInt(contentResolver, "speak_password", 0) == 1;
    }

    public final void setAccessibilityNodeInfoBooleanAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        accessibilityNodeInfoCompat.a.setCheckable(z);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setChecked(z2);
        accessibilityNodeInfoCompat.n(z3);
        accessibilityNodeInfo.setEnabled(z5);
        accessibilityNodeInfo.setFocusable(z6);
        accessibilityNodeInfo.setFocused(z7);
        accessibilityNodeInfo.setPassword(z9);
        accessibilityNodeInfoCompat.q(z10);
        accessibilityNodeInfo.setSelected(z11);
        accessibilityNodeInfo.setVisibleToUser(z12);
        if (z4 && z7) {
            if (i != this.L) {
                this.L = i;
                this.M = Calendar.getInstance().getTimeInMillis();
                accessibilityNodeInfo.setContentInvalid(true);
            } else if (Calendar.getInstance().getTimeInMillis() - this.M >= 4500) {
                this.M = Calendar.getInstance().getTimeInMillis();
                accessibilityNodeInfo.setContentInvalid(true);
            }
        } else {
            accessibilityNodeInfo.setContentInvalid(z4);
        }
        if (z8) {
            accessibilityNodeInfoCompat.f().putCharSequence("AccessibilityNodeInfo.hasImage", "true");
        }
        accessibilityNodeInfo.setMovementGranularities(7);
        accessibilityNodeInfo.setAccessibilityFocused(this.t == i);
    }

    public void setAccessibilityNodeInfoViewIdResourceName(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        accessibilityNodeInfoCompat.a.setViewIdResourceName(str);
    }

    public void setAccessibilityNodeInfoSelectionAttrs(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2) {
        accessibilityNodeInfoCompat.a.setEditable(true);
        accessibilityNodeInfoCompat.a.setTextSelection(i, i2);
    }

    public void setAccessibilityNodeInfoPaneTitle(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", str);
        }
    }
}
