package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3184Yn extends U80 {
    public final View b;
    public final Integer c;
    public final Integer d;
    public final InterfaceC11372xG3 e;
    public final InterfaceC7103kq0 f;
    public final float g;
    public final CK2 h;
    public final boolean i;
    public final boolean j;
    public final MJ2 k;
    public final StringBuilder l;
    public final String m;
    public final String n;
    public final WeakReference o;
    public final WeakReference p;
    public final AbstractC0562Ei1 q;
    public final AbstractC5771gx0 r;
    public final String s;
    public final String t;
    public final boolean u;
    public final C3998bo v;
    public final boolean w;
    public final int x;
    public final AtomicReference y;

    public C3184Yn(View view, Integer num, Integer num2, InterfaceC11372xG3 interfaceC11372xG3, InterfaceC7103kq0 interfaceC7103kq0, float f, CK2 ck2, boolean z, boolean z2, MJ2 mj2, StringBuilder sb, String str, String str2, WeakReference weakReference, WeakReference weakReference2, AbstractC0562Ei1 abstractC0562Ei1, AbstractC5771gx0 abstractC5771gx0, String str3, String str4, boolean z3, C3998bo c3998bo, boolean z4, int i, AtomicReference atomicReference) {
        this.b = view;
        this.c = num;
        this.d = num2;
        this.e = interfaceC11372xG3;
        this.f = interfaceC7103kq0;
        this.g = f;
        this.h = ck2;
        this.i = z;
        this.j = z2;
        this.k = mj2;
        this.l = sb;
        this.m = str;
        this.n = str2;
        this.o = weakReference;
        this.p = weakReference2;
        this.q = abstractC0562Ei1;
        this.r = abstractC5771gx0;
        this.s = str3;
        this.t = str4;
        this.u = z3;
        this.v = c3998bo;
        this.w = z4;
        this.x = i;
        this.y = atomicReference;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.k);
        String valueOf6 = String.valueOf(this.l);
        String valueOf7 = String.valueOf(this.o);
        String valueOf8 = String.valueOf(this.p);
        String valueOf9 = String.valueOf(this.q);
        String valueOf10 = String.valueOf(this.r);
        String valueOf11 = String.valueOf(this.v);
        String valueOf12 = String.valueOf(this.y);
        StringBuilder sb = new StringBuilder("ConversionContext{container=");
        sb.append(valueOf);
        sb.append(", widthConstraint=");
        sb.append(this.c);
        sb.append(", heightConstraint=");
        sb.append(this.d);
        sb.append(", templateLoggerFactory=");
        sb.append(valueOf2);
        sb.append(", rootDisposableContainer=");
        sb.append(valueOf3);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(this.g);
        sb.append(", horizontalCollectionTouchInterceptor=null, horizontalCollectionSwipeProtector=");
        sb.append(valueOf4);
        sb.append(", useIncrementalMountOnChildrenInternal=");
        sb.append(this.i);
        sb.append(", useLegacyVisibleInternal=");
        sb.append(this.j);
        sb.append(", recyclerBinderConfiguration=");
        sb.append(valueOf5);
        sb.append(", pathBuilder=");
        sb.append(valueOf6);
        sb.append(", elementId=");
        sb.append(this.m);
        sb.append(", identifierProperty=");
        AbstractC9972tB0.a(sb, this.n, ", loggingNodeInternal=", valueOf7, ", parentLoggingNodeInternal=");
        AbstractC9972tB0.a(sb, valueOf8, ", elementsInteractionLoggerInternal=null, globalCommandDataDecoratorsInternal=", valueOf9, ", decoratingElementBuilder=");
        sb.append(valueOf10);
        sb.append(", debugId=");
        sb.append(this.s);
        sb.append(", treeDebugId=");
        sb.append(this.t);
        sb.append(", shouldAddDebuggerViewTags=");
        sb.append(this.u);
        sb.append(", elementsConfig=");
        sb.append(valueOf11);
        sb.append(", couldOverlapWithElementsConfig=");
        sb.append(this.w);
        sb.append(", elementDepthInTree=");
        sb.append(this.x);
        sb.append(", scrollStrategyListenerHolder=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        CK2 ck2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U80)) {
            return false;
        }
        U80 u80 = (U80) obj;
        View view = this.b;
        if (view != null ? view.equals(((C3184Yn) u80).b) : ((C3184Yn) u80).b == null) {
            Integer num = this.c;
            if (num != null ? num.equals(((C3184Yn) u80).c) : ((C3184Yn) u80).c == null) {
                Integer num2 = this.d;
                if (num2 != null ? num2.equals(((C3184Yn) u80).d) : ((C3184Yn) u80).d == null) {
                    InterfaceC11372xG3 interfaceC11372xG3 = this.e;
                    if (interfaceC11372xG3 != null ? interfaceC11372xG3.equals(((C3184Yn) u80).e) : ((C3184Yn) u80).e == null) {
                        InterfaceC7103kq0 interfaceC7103kq0 = this.f;
                        if (interfaceC7103kq0 != null ? interfaceC7103kq0.equals(((C3184Yn) u80).f) : ((C3184Yn) u80).f == null) {
                            C3184Yn c3184Yn = (C3184Yn) u80;
                            if (Float.floatToIntBits(this.g) == Float.floatToIntBits(c3184Yn.g) && ((ck2 = this.h) != null ? ck2.equals(c3184Yn.h) : c3184Yn.h == null)) {
                                if (this.i == c3184Yn.i && this.j == c3184Yn.j) {
                                    MJ2 mj2 = c3184Yn.k;
                                    MJ2 mj22 = this.k;
                                    if (mj22 != null ? mj22.equals(mj2) : mj2 == null) {
                                        StringBuilder sb = c3184Yn.l;
                                        StringBuilder sb2 = this.l;
                                        if (sb2 != null ? sb2.equals(sb) : sb == null) {
                                            if (this.m.equals(c3184Yn.m) && this.n.equals(c3184Yn.n)) {
                                                WeakReference weakReference = c3184Yn.o;
                                                WeakReference weakReference2 = this.o;
                                                if (weakReference2 != null ? weakReference2.equals(weakReference) : weakReference == null) {
                                                    WeakReference weakReference3 = c3184Yn.p;
                                                    WeakReference weakReference4 = this.p;
                                                    if (weakReference4 != null ? weakReference4.equals(weakReference3) : weakReference3 == null) {
                                                        AbstractC0562Ei1 abstractC0562Ei1 = c3184Yn.q;
                                                        AbstractC0562Ei1 abstractC0562Ei12 = this.q;
                                                        if (abstractC0562Ei12 != null ? abstractC0562Ei12.equals(abstractC0562Ei1) : abstractC0562Ei1 == null) {
                                                            AbstractC5771gx0 abstractC5771gx0 = c3184Yn.r;
                                                            AbstractC5771gx0 abstractC5771gx02 = this.r;
                                                            if (abstractC5771gx02 != null ? abstractC5771gx02.equals(abstractC5771gx0) : abstractC5771gx0 == null) {
                                                                String str = c3184Yn.s;
                                                                String str2 = this.s;
                                                                if (str2 != null ? str2.equals(str) : str == null) {
                                                                    String str3 = c3184Yn.t;
                                                                    String str4 = this.t;
                                                                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                                                                        if (this.u == c3184Yn.u) {
                                                                            C3998bo c3998bo = c3184Yn.v;
                                                                            C3998bo c3998bo2 = this.v;
                                                                            if (c3998bo2 != null ? c3998bo2.equals(c3998bo) : c3998bo == null) {
                                                                                if (this.w == c3184Yn.w && this.x == c3184Yn.x) {
                                                                                    AtomicReference atomicReference = c3184Yn.y;
                                                                                    AtomicReference atomicReference2 = this.y;
                                                                                    if (atomicReference2 == null) {
                                                                                        if (atomicReference == null) {
                                                                                            return true;
                                                                                        }
                                                                                    } else if (atomicReference2.equals(atomicReference)) {
                                                                                        return true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        View view = this.b;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.c;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        InterfaceC11372xG3 interfaceC11372xG3 = this.e;
        int hashCode4 = (hashCode3 ^ (interfaceC11372xG3 == null ? 0 : interfaceC11372xG3.hashCode())) * 1000003;
        InterfaceC7103kq0 interfaceC7103kq0 = this.f;
        int hashCode5 = (((((hashCode4 ^ (interfaceC7103kq0 == null ? 0 : interfaceC7103kq0.hashCode())) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ 0) * 1000003;
        CK2 ck2 = this.h;
        int hashCode6 = (((((hashCode5 ^ (ck2 == null ? 0 : ck2.hashCode())) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003;
        MJ2 mj2 = this.k;
        int hashCode7 = (hashCode6 ^ (mj2 == null ? 0 : mj2.hashCode())) * 1000003;
        StringBuilder sb = this.l;
        int hashCode8 = (((((hashCode7 ^ (sb == null ? 0 : sb.hashCode())) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        WeakReference weakReference = this.o;
        int hashCode9 = (hashCode8 ^ (weakReference == null ? 0 : weakReference.hashCode())) * 1000003;
        WeakReference weakReference2 = this.p;
        int hashCode10 = (((hashCode9 ^ (weakReference2 == null ? 0 : weakReference2.hashCode())) * 1000003) ^ 0) * 1000003;
        AbstractC0562Ei1 abstractC0562Ei1 = this.q;
        int hashCode11 = (hashCode10 ^ (abstractC0562Ei1 == null ? 0 : abstractC0562Ei1.hashCode())) * 1000003;
        AbstractC5771gx0 abstractC5771gx0 = this.r;
        int hashCode12 = (hashCode11 ^ (abstractC5771gx0 == null ? 0 : abstractC5771gx0.hashCode())) * 1000003;
        String str = this.s;
        int hashCode13 = (hashCode12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.t;
        int hashCode14 = (((hashCode13 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003;
        C3998bo c3998bo = this.v;
        int hashCode15 = (((((hashCode14 ^ (c3998bo == null ? 0 : c3998bo.hashCode())) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ this.x) * 1000003;
        AtomicReference atomicReference = this.y;
        return (atomicReference != null ? atomicReference.hashCode() : 0) ^ hashCode15;
    }
}
