package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.omnibox.UrlBarApi26;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h34 */
/* loaded from: classes.dex */
public final class C5809h34 implements InterfaceC6495j34, InterfaceC10272u34 {
    public static final RunnableC12082zL2 m = new RunnableC12082zL2();
    public UrlBarApi26 a;
    public C7183l34 g;
    public final C11939yv1 h;
    public final C8820pp4 i;
    public Runnable j;
    public Runnable k;
    public Callback l;

    @Override // defpackage.InterfaceC10272u34
    public final /* synthetic */ void L(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [e34] */
    public C5809h34(UrlBarApi26 urlBarApi26, C8820pp4 c8820pp4, ActionMode.Callback callback, Callback callback2, InterfaceC3403a34 interfaceC3403a34, C11939yv1 c11939yv1, boolean z, Callback callback3) {
        RunnableC12082zL2 runnableC12082zL2 = m;
        this.j = runnableC12082zL2;
        this.k = runnableC12082zL2;
        this.a = urlBarApi26;
        urlBarApi26.setTag(R.id.report_exception_callback, callback3);
        this.h = c11939yv1;
        this.i = c8820pp4;
        this.l = callback2;
        HashMap e = PropertyModel.e(AbstractC8215o34.o);
        PD2 pd2 = AbstractC8215o34.a;
        GD2 gd2 = new GD2();
        gd2.a = callback;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC8215o34.n;
        GD2 gd22 = new GD2();
        gd22.a = c8820pp4;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC8215o34.d;
        GD2 gd23 = new GD2();
        gd23.a = interfaceC3403a34;
        e.put(pd23, gd23);
        LD2 ld2 = AbstractC8215o34.m;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(ld2, ad2);
        PropertyModel propertyModel = new PropertyModel(e);
        UD2.a(propertyModel, urlBarApi26, new TD2() { // from class: d34
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                int i;
                int d;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                final UrlBarApi26 urlBarApi262 = (UrlBarApi26) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd24 = AbstractC8215o34.a;
                if (pd24.equals(fd2)) {
                    ActionMode.Callback callback4 = (ActionMode.Callback) propertyModel2.i(pd24);
                    if (callback4 == null && urlBarApi262.getCustomSelectionActionModeCallback() == null) {
                        return;
                    }
                    urlBarApi262.setCustomSelectionActionModeCallback(callback4);
                    return;
                }
                LD2 ld22 = AbstractC8215o34.b;
                if (ld22.equals(fd2)) {
                    boolean j = propertyModel2.j(ld22);
                    urlBarApi262.F = j;
                    urlBarApi262.setFocusable(j);
                    urlBarApi262.setFocusableInTouchMode(j);
                    return;
                }
                PD2 pd25 = AbstractC8215o34.c;
                if (pd25.equals(fd2)) {
                    C7527m34 c7527m34 = (C7527m34) propertyModel2.i(pd25);
                    InterfaceC11558xp interfaceC11558xp = urlBarApi262.m;
                    if (interfaceC11558xp != null ? interfaceC11558xp.f() : false) {
                        String str = c7527m34.a;
                        String str2 = c7527m34.b;
                        if (!TextUtils.isEmpty(str2)) {
                            urlBarApi262.r = true;
                        }
                        InterfaceC11558xp interfaceC11558xp2 = urlBarApi262.m;
                        if (interfaceC11558xp2 != null) {
                            interfaceC11558xp2.c(str, str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                PD2 pd26 = AbstractC8215o34.d;
                if (!pd26.equals(fd2)) {
                    PD2 pd27 = AbstractC8215o34.e;
                    if (pd27.equals(fd2)) {
                        final Callback callback5 = (Callback) propertyModel2.i(pd27);
                        urlBarApi262.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: p34
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z2) {
                                if (z2) {
                                    UrlBarApi26.this.w(false);
                                }
                                callback5.onResult(Boolean.valueOf(z2));
                            }
                        });
                        return;
                    }
                    LD2 ld23 = AbstractC8215o34.f;
                    if (ld23.equals(fd2)) {
                        urlBarApi262.setCursorVisible(propertyModel2.j(ld23));
                        return;
                    }
                    PD2 pd28 = AbstractC8215o34.g;
                    if (!pd28.equals(fd2)) {
                        PD2 pd29 = AbstractC8215o34.h;
                        if (pd29.equals(fd2)) {
                            C7871n34 c7871n34 = (C7871n34) propertyModel2.i(pd29);
                            urlBarApi262.w(true);
                            urlBarApi262.setText(c7871n34.a);
                            urlBarApi262.T = c7871n34.b;
                            int i2 = c7871n34.c;
                            if (i2 == 1) {
                                urlBarApi262.R = c7871n34.d;
                            } else {
                                urlBarApi262.R = 0;
                            }
                            urlBarApi262.S = i2;
                            if (urlBarApi262.isLayoutRequested()) {
                                urlBarApi262.G = urlBarApi262.S != 0;
                            } else {
                                urlBarApi262.v(urlBarApi262.S);
                            }
                            urlBarApi262.w(false);
                            if (urlBarApi262.hasFocus()) {
                                int i3 = c7871n34.e;
                                if (i3 == 0) {
                                    urlBarApi262.selectAll();
                                    return;
                                } else {
                                    if (i3 == 1) {
                                        urlBarApi262.setSelection(urlBarApi262.getText().length());
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        ND2 nd2 = AbstractC8215o34.l;
                        if (nd2.equals(fd2)) {
                            int h = propertyModel2.h(nd2);
                            int c = AbstractC5647gc2.c(urlBarApi262.getContext(), h);
                            int d2 = AbstractC5647gc2.d(urlBarApi262.getContext(), h);
                            urlBarApi262.setTextColor(c);
                            Editable text = urlBarApi262.getText();
                            if (TextUtils.isEmpty(text)) {
                                urlBarApi262.setHintTextColor(d2);
                                return;
                            }
                            int selectionStart = urlBarApi262.getSelectionStart();
                            int selectionEnd = urlBarApi262.getSelectionEnd();
                            urlBarApi262.w(true);
                            urlBarApi262.setText("");
                            urlBarApi262.setHintTextColor(d2);
                            urlBarApi262.setText(text);
                            if (selectionStart >= 0 && selectionEnd >= 0 && urlBarApi262.hasFocus()) {
                                Selection.setSelection(urlBarApi262.getText(), selectionStart, selectionEnd);
                            }
                            urlBarApi262.w(false);
                            return;
                        }
                        LD2 ld24 = AbstractC8215o34.m;
                        if (ld24.equals(fd2)) {
                            boolean j2 = propertyModel2.j(ld24);
                            Object tag = urlBarApi262.getTag(R.id.highlight_color);
                            if (tag == null || !(tag instanceof Integer)) {
                                int highlightColor = urlBarApi262.getHighlightColor();
                                urlBarApi262.setTag(R.id.highlight_color, Integer.valueOf(highlightColor));
                                i = highlightColor;
                            } else {
                                i = ((Integer) tag).intValue();
                            }
                            if (j2) {
                                i = urlBarApi262.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0708a6);
                            }
                            urlBarApi262.setHighlightColor(i);
                            if (Build.VERSION.SDK_INT >= 29) {
                                try {
                                    Drawable textCursorDrawable = urlBarApi262.getTextCursorDrawable();
                                    Drawable textSelectHandle = urlBarApi262.getTextSelectHandle();
                                    Drawable textSelectHandleLeft = urlBarApi262.getTextSelectHandleLeft();
                                    Drawable textSelectHandleRight = urlBarApi262.getTextSelectHandleRight();
                                    if (j2) {
                                        d = urlBarApi262.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f070107);
                                    } else {
                                        d = AbstractC9685sM1.d(urlBarApi262, R.attr.0_resource_name_obfuscated_res_0x7f05013a);
                                    }
                                    textCursorDrawable.mutate().setTint(d);
                                    textSelectHandle.mutate().setTint(d);
                                    textSelectHandleLeft.mutate().setTint(d);
                                    textSelectHandleRight.mutate().setTint(d);
                                    return;
                                } catch (Resources.NotFoundException e2) {
                                    if (Build.VERSION.SDK_INT < 31) {
                                        AbstractC4851eH1.a("UrlBarViewBinder", "Failed to access the cursor or handle drawable, skipped tinting.", e2);
                                        ((Callback) urlBarApi262.getTag(R.id.report_exception_callback)).onResult(new Throwable("This is not a crash. See https://crbug.com/1263630 for details.", e2));
                                        return;
                                    }
                                    throw e2;
                                }
                            }
                            return;
                        }
                        PD2 pd210 = AbstractC8215o34.i;
                        if (pd210.equals(fd2)) {
                            Callback callback6 = (Callback) propertyModel2.i(pd210);
                            urlBarApi262.z = callback6;
                            if (callback6 != null) {
                                callback6.onResult(Integer.valueOf(urlBarApi262.u));
                                return;
                            }
                            return;
                        }
                        PD2 pd211 = AbstractC8215o34.j;
                        if (!pd211.equals(fd2)) {
                            PD2 pd212 = AbstractC8215o34.k;
                            if (pd212.equals(fd2)) {
                                TextWatcher textWatcher = (TextWatcher) propertyModel2.i(pd212);
                                if (Objects.equals(urlBarApi262.x, textWatcher)) {
                                    return;
                                }
                                TextWatcher textWatcher2 = urlBarApi262.x;
                                if (textWatcher2 != null) {
                                    urlBarApi262.removeTextChangedListener(textWatcher2);
                                }
                                urlBarApi262.x = textWatcher;
                                urlBarApi262.addTextChangedListener(textWatcher);
                                return;
                            }
                            PD2 pd213 = AbstractC8215o34.n;
                            if (pd213.equals(fd2)) {
                                urlBarApi262.B.j = (C8820pp4) propertyModel2.i(pd213);
                                return;
                            }
                            return;
                        }
                        urlBarApi262.w = (InterfaceC4090c34) propertyModel2.i(pd211);
                        return;
                    }
                    urlBarApi262.y = (InterfaceC3747b34) propertyModel2.i(pd28);
                    return;
                }
                urlBarApi262.v = (InterfaceC3403a34) propertyModel2.i(pd26);
            }
        });
        this.g = new C7183l34(new Callback() { // from class: e34
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C5809h34 c5809h34 = C5809h34.this;
                InputMethodManager inputMethodManager = (InputMethodManager) c5809h34.a.getContext().getSystemService("input_method");
                if (booleanValue) {
                    inputMethodManager.viewClicked(c5809h34.a);
                } else if (inputMethodManager.isActive(c5809h34.a)) {
                    c5809h34.c(false, false);
                }
                c5809h34.l.onResult(Boolean.valueOf(booleanValue));
            }
        }, propertyModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:            if (defpackage.C6153i34.f.contains(r1) != false) goto L219;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:            if (r2 == null) goto L258;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.C6153i34 r13, int r14, int r15) {
        /*
            r12 = this;
            l34 r0 = r12.g
            r0.getClass()
            int r1 = r13.e
            int r2 = r13.d
            r3 = 2
            if (r1 != r2) goto Ld
            r14 = r3
        Ld:
            java.lang.CharSequence r2 = r13.b
            java.lang.String r4 = r13.a
            if (r4 == 0) goto L30
            int r5 = r2.length()
            if (r1 != r5) goto L30
            android.net.Uri r1 = android.net.Uri.parse(r4)
            java.lang.String r1 = r1.getScheme()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L30
            java.util.HashSet r4 = defpackage.C6153i34.f
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L30
            goto L31
        L30:
            r3 = r14
        L31:
            boolean r14 = r0.h
            r1 = 1
            if (r14 != 0) goto Lc2
            i34 r14 = r0.i
            r4 = 0
            if (r14 != 0) goto L3d
            goto Lb9
        L3d:
            java.lang.String r5 = r14.c
            java.lang.String r6 = r13.c
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L49
            goto Lb9
        L49:
            java.lang.CharSequence r14 = r14.b
            if (r14 != 0) goto L51
            if (r2 != 0) goto Lb9
            goto Lb7
        L51:
            boolean r5 = android.text.TextUtils.equals(r14, r2)
            if (r5 != 0) goto L58
            goto Lb9
        L58:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L5f
            goto Lb7
        L5f:
            boolean r5 = r2 instanceof android.text.Spanned
            if (r5 == 0) goto Lb9
            boolean r5 = r14 instanceof android.text.Spanned
            if (r5 != 0) goto L68
            goto Lb9
        L68:
            android.text.Spanned r14 = (android.text.Spanned) r14
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r14.length()
            java.lang.Class<vc2> r6 = defpackage.InterfaceC10797vc2.class
            java.lang.Object[] r5 = r14.getSpans(r4, r5, r6)
            vc2[] r5 = (defpackage.InterfaceC10797vc2[]) r5
            int r7 = r2.length()
            java.lang.Object[] r6 = r2.getSpans(r4, r7, r6)
            vc2[] r6 = (defpackage.InterfaceC10797vc2[]) r6
            int r7 = r5.length
            int r8 = r6.length
            if (r7 == r8) goto L87
            goto Lb9
        L87:
            r7 = r4
        L88:
            int r8 = r5.length
            if (r7 >= r8) goto Lb7
            r8 = r5[r7]
            r9 = r6[r7]
            boolean r10 = r8.equals(r9)
            if (r10 == 0) goto Lb9
            int r10 = r14.getSpanStart(r8)
            int r11 = r2.getSpanStart(r9)
            if (r10 != r11) goto Lb9
            int r10 = r14.getSpanEnd(r8)
            int r11 = r2.getSpanEnd(r9)
            if (r10 != r11) goto Lb9
            int r8 = r14.getSpanFlags(r8)
            int r9 = r2.getSpanFlags(r9)
            if (r8 == r9) goto Lb4
            goto Lb9
        Lb4:
            int r7 = r7 + 1
            goto L88
        Lb7:
            r14 = r1
            goto Lba
        Lb9:
            r14 = r4
        Lba:
            if (r14 == 0) goto Lc2
            int r14 = r0.j
            if (r14 != r3) goto Lc2
            r1 = r4
            goto Lcb
        Lc2:
            r0.i = r13
            r0.j = r3
            r0.k = r15
            r0.b()
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5809h34.f(i34, int, int):boolean");
    }

    public final String a() {
        InterfaceC11558xp interfaceC11558xp = this.a.m;
        return interfaceC11558xp == null ? "" : interfaceC11558xp.j();
    }

    public final String b() {
        InterfaceC11558xp interfaceC11558xp = this.a.m;
        return interfaceC11558xp == null ? "" : interfaceC11558xp.k();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        this.a.removeCallbacks(this.j);
    }

    public final void c(boolean z, boolean z2) {
        this.a.removeCallbacks(this.k);
        if (z) {
            e(32, false);
            this.h.i(this.a);
        } else {
            Runnable runnable = new Runnable() { // from class: f34
                @Override // java.lang.Runnable
                public final void run() {
                    C5809h34 c5809h34 = C5809h34.this;
                    c5809h34.h.d(c5809h34.a);
                    c5809h34.k = C5809h34.m;
                }
            };
            this.k = runnable;
            this.a.postDelayed(runnable, z2 ? 150L : 0L);
            e(16, true);
        }
    }

    public final void e(final int i, boolean z) {
        this.a.removeCallbacks(this.j);
        C8820pp4 c8820pp4 = this.i;
        if (c8820pp4 != null) {
            Window window = c8820pp4.a;
            if (window.getAttributes().softInputMode == i) {
                return;
            }
            if (!z) {
                window.setSoftInputMode(i);
                return;
            }
            Runnable runnable = new Runnable() { // from class: g34
                @Override // java.lang.Runnable
                public final void run() {
                    C5809h34 c5809h34 = C5809h34.this;
                    c5809h34.i.a.setSoftInputMode(i);
                    c5809h34.j = C5809h34.m;
                }
            };
            this.j = runnable;
            this.a.postDelayed(runnable, 300L);
        }
    }
}
