package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Op3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1898Op3 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public C1898Op3(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1509Lp3)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        ColorStateList colorStateList;
        C1768Np3 c1768Np3 = new C1768Np3(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = c1768Np3.a;
            z = z;
            z = z;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (!name2.equals("group")) {
                        if (!name2.equals("item")) {
                            z = z;
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        } else {
                            z = z;
                            if (!c1768Np3.h) {
                                AbstractC9250r5 abstractC9250r5 = c1768Np3.z;
                                if (abstractC9250r5 == null || !((AbstractC6973kT1) abstractC9250r5).a.hasSubMenu()) {
                                    c1768Np3.h = true;
                                    c1768Np3.b(menu2.add(c1768Np3.b, c1768Np3.i, c1768Np3.j, c1768Np3.k));
                                    z = z;
                                } else {
                                    c1768Np3.h = true;
                                    c1768Np3.b(menu2.addSubMenu(c1768Np3.b, c1768Np3.i, c1768Np3.j, c1768Np3.k).getItem());
                                    z = z;
                                }
                            }
                        }
                    } else {
                        c1768Np3.b = 0;
                        c1768Np3.c = 0;
                        c1768Np3.d = 0;
                        c1768Np3.e = 0;
                        c1768Np3.f = true;
                        c1768Np3.g = true;
                        z = z;
                    }
                }
            } else if (!z2) {
                String name3 = xmlResourceParser.getName();
                boolean equals = name3.equals("group");
                C1898Op3 c1898Op3 = c1768Np3.E;
                if (!equals) {
                    if (!name3.equals("item")) {
                        if (name3.equals("menu")) {
                            c1768Np3.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(c1768Np3.b, c1768Np3.i, c1768Np3.j, c1768Np3.k);
                            c1768Np3.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z2 = true;
                        }
                    } else {
                        Context context = c1898Op3.c;
                        IN3 in3 = new IN3(context, context.obtainStyledAttributes(attributeSet, JG2.t0));
                        c1768Np3.i = in3.i(2, 0);
                        c1768Np3.j = (in3.h(5, c1768Np3.c) & (-65536)) | (in3.h(6, c1768Np3.d) & 65535);
                        c1768Np3.k = in3.k(7);
                        c1768Np3.l = in3.k(8);
                        c1768Np3.m = in3.i(0, 0);
                        String j = in3.j(9);
                        c1768Np3.n = j == null ? (char) 0 : j.charAt(0);
                        c1768Np3.o = in3.h(16, 4096);
                        String j2 = in3.j(10);
                        c1768Np3.p = j2 == null ? (char) 0 : j2.charAt(0);
                        c1768Np3.q = in3.h(20, 4096);
                        if (in3.l(11)) {
                            c1768Np3.r = in3.a(11, false) ? 1 : 0;
                        } else {
                            c1768Np3.r = c1768Np3.e;
                        }
                        c1768Np3.s = in3.a(3, false);
                        c1768Np3.t = in3.a(4, c1768Np3.f);
                        c1768Np3.u = in3.a(1, c1768Np3.g);
                        c1768Np3.v = in3.h(21, -1);
                        c1768Np3.y = in3.j(12);
                        c1768Np3.w = in3.i(13, 0);
                        c1768Np3.x = in3.j(15);
                        String j3 = in3.j(14);
                        boolean z3 = j3 != null;
                        if (z3 && c1768Np3.w == 0 && c1768Np3.x == null) {
                            c1768Np3.z = (AbstractC9250r5) c1768Np3.a(j3, f, c1898Op3.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c1768Np3.z = null;
                        }
                        c1768Np3.A = in3.k(17);
                        c1768Np3.B = in3.k(22);
                        if (in3.l(19)) {
                            c1768Np3.D = AbstractC3085Xt0.c(in3.h(19, -1), c1768Np3.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            c1768Np3.D = null;
                        }
                        if (in3.l(18)) {
                            c1768Np3.C = in3.b(18);
                        } else {
                            c1768Np3.C = colorStateList;
                        }
                        in3.n();
                        c1768Np3.h = false;
                    }
                } else {
                    TypedArray obtainStyledAttributes = c1898Op3.c.obtainStyledAttributes(attributeSet, JG2.s0);
                    c1768Np3.b = obtainStyledAttributes.getResourceId(1, 0);
                    c1768Np3.c = obtainStyledAttributes.getInt(3, 0);
                    c1768Np3.d = obtainStyledAttributes.getInt(4, 0);
                    c1768Np3.e = obtainStyledAttributes.getInt(5, 0);
                    c1768Np3.f = obtainStyledAttributes.getBoolean(2, true);
                    c1768Np3.g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    z = z;
                }
            }
            eventType = xmlResourceParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }
}
