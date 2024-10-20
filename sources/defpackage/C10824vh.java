package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vh */
/* loaded from: classes.dex */
public final class C10824vh extends C9795sh {
    @Override // defpackage.C9795sh
    public final void c(final Um4 um4) {
        if (um4 == null || um4.b == null) {
            return;
        }
        AbstractC0185Bl.e.execute(new Runnable() { // from class: uh
            @Override // java.lang.Runnable
            public final void run() {
                C10824vh.this.getClass();
                C3982bl1 c3982bl1 = new C3982bl1("WebPage");
                Um4 um42 = um4;
                c3982bl1.d = um42.b.b;
                c3982bl1.c("name", um42.c);
                try {
                    InterfaceC4325cl1[] interfaceC4325cl1Arr = new InterfaceC4325cl1[um42.d.length];
                    int i = 0;
                    while (true) {
                        C3451aC0[] c3451aC0Arr = um42.d;
                        if (i < c3451aC0Arr.length) {
                            interfaceC4325cl1Arr[i] = C10824vh.e(c3451aC0Arr[i]);
                            i++;
                        } else {
                            try {
                                break;
                            } catch (C10380uO0 e) {
                                AbstractC4851eH1.f("AppIndexingRepI", "Failed to add argument.", e);
                            }
                        }
                    }
                    c3982bl1.b("mainEntity", interfaceC4325cl1Arr);
                    try {
                        C8666pO0.a(V60.a).c(c3982bl1.a());
                        C10824vh.f(um42.b.b, um42.c);
                    } catch (IllegalArgumentException e2) {
                        AbstractC4851eH1.f("AppIndexingRepI", "Failed to build indexable.", e2);
                    }
                } catch (IllegalArgumentException e3) {
                    AbstractC4851eH1.f("AppIndexingRepI", "Failed to convert entities.", e3);
                }
            }
        });
    }

    @Override // defpackage.C9795sh
    public final void d(final String str, final String str2) {
        if (str == null || str2 == null) {
            return;
        }
        AbstractC0185Bl.e.execute(new Runnable() { // from class: th
            @Override // java.lang.Runnable
            public final void run() {
                C10824vh.this.getClass();
                C10824vh.f(str, str2);
            }
        });
    }

    public static void f(String str, String str2) {
        CO0 co0;
        Context context = V60.a;
        synchronized (CO0.class) {
            WeakReference weakReference = CO0.b;
            co0 = weakReference == null ? null : (CO0) weakReference.get();
            if (co0 == null) {
                co0 = new CO0(context.getApplicationContext());
                CO0.b = new WeakReference(co0);
            }
        }
        ActionImpl actionImpl = new ActionImpl("ViewAction", str2, str, null, new ActionImpl.MetadataImpl(false), null, new Bundle());
        actionImpl.j.a = 2;
        co0.a.b(1, new AO0(new ActionImpl[]{actionImpl}));
    }

    @Override // defpackage.C9795sh
    public final void a() {
        C8666pO0.a(V60.a).b(new MutateRequest(4, null, null, null, null, null, null));
    }

    public static Thing e(C3451aC0 c3451aC0) {
        String str = c3451aC0.b;
        if (str == null || str.isEmpty()) {
            c3451aC0.b = "Thing";
        }
        C3982bl1 c3982bl1 = new C3982bl1(c3451aC0.b);
        for (C10327uD2 c10327uD2 : c3451aC0.c) {
            O74 o74 = c10327uD2.c;
            if (o74 != null) {
                int i = o74.a;
                if (!(i == -1)) {
                    Bundle bundle = c3982bl1.a;
                    if (i == 0) {
                        String str2 = c10327uD2.b;
                        boolean[] zArr = o74.b;
                        if (zArr.length > 0) {
                            if (zArr.length >= 100) {
                                zArr = Arrays.copyOf(zArr, 100);
                            }
                            bundle.putBooleanArray(str2, zArr);
                        }
                    } else if (i == 1) {
                        String str3 = c10327uD2.b;
                        long[] jArr = o74.c;
                        if (jArr.length > 0) {
                            if (jArr.length >= 100) {
                                jArr = Arrays.copyOf(jArr, 100);
                            }
                            bundle.putLongArray(str3, jArr);
                        }
                    } else if (i == 2) {
                        c3982bl1.c(c10327uD2.b, o74.d);
                    } else if (i == 3) {
                        InterfaceC4325cl1[] interfaceC4325cl1Arr = new InterfaceC4325cl1[o74.e.length];
                        int i2 = 0;
                        while (true) {
                            C3451aC0[] c3451aC0Arr = c10327uD2.c.e;
                            if (i2 < c3451aC0Arr.length) {
                                C3451aC0 c3451aC02 = c3451aC0Arr[i2];
                                if (c3451aC02 != null) {
                                    interfaceC4325cl1Arr[i2] = e(c3451aC02);
                                }
                                i2++;
                            } else {
                                try {
                                    break;
                                } catch (C10380uO0 e) {
                                    AbstractC4851eH1.f("AppIndexingRepI", "Failed to add argument.", e);
                                }
                            }
                        }
                        c3982bl1.b(c10327uD2.b, interfaceC4325cl1Arr);
                    }
                }
            }
        }
        return c3982bl1.a();
    }
}
