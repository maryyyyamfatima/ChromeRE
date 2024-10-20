package defpackage;

import J.N;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.endpoint_fetcher.EndpointResponse;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.subscriptions.CommerceSubscriptionsStorage;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.prefs.PrefService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3063Xo3 implements InterfaceC0984Ho3 {
    public final CommerceSubscriptionsStorage a;
    public final C9743sY b;
    public boolean c;
    public final LinkedList d;
    public final C12157za2 e;
    public final InterfaceC6813jz2 f;

    public C3063Xo3(Profile profile, C8875pz2 c8875pz2) {
        CommerceSubscriptionsStorage commerceSubscriptionsStorage = new CommerceSubscriptionsStorage(profile);
        C9743sY c9743sY = new C9743sY(profile);
        this.a = commerceSubscriptionsStorage;
        this.b = c9743sY;
        this.f = c8875pz2;
        this.d = new LinkedList();
        this.c = false;
        a("PRICE_TRACK", true, new C1504Lo3(new Callback() { // from class: Io3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C3063Xo3 c3063Xo3 = C3063Xo3.this;
                c3063Xo3.c = true;
                int intValue = ((Integer) obj).intValue();
                LinkedList<C2933Wo3> linkedList = c3063Xo3.d;
                if (intValue == 0) {
                    for (C2933Wo3 c2933Wo3 : linkedList) {
                        int i = c2933Wo3.a;
                        Callback callback = c2933Wo3.c;
                        List list = c2933Wo3.b;
                        if (i == 0) {
                            c3063Xo3.d(list, callback);
                        } else if (1 == i) {
                            c3063Xo3.f(list, callback);
                        }
                    }
                } else {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((C2933Wo3) it.next()).c.onResult(3);
                    }
                }
                linkedList.clear();
            }
        }, this));
        this.e = new C12157za2();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Mo3, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r2v3, types: [No3] */
    public final void d(final List list, final Callback callback) {
        if (list.size() == 0) {
            callback.onResult(0);
            return;
        }
        final ?? r0 = new Callback(list, callback, this) { // from class: Mo3
            public final /* synthetic */ C3063Xo3 a;
            public final /* synthetic */ Callback g;

            {
                this.a = this;
                this.g = callback;
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                C3063Xo3 c3063Xo3 = this.a;
                c3063Xo3.getClass();
                if (num.intValue() == 0) {
                    Iterator it = c3063Xo3.e.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        } else {
                            ((C1295Jz) c11814ya2.next()).getClass();
                        }
                    }
                }
                this.g.onResult(num);
            }
        };
        final String str = ((CommerceSubscription) list.get(0)).b;
        if (!"PRICE_TRACK".equals(str)) {
            r0.onResult(4);
            return;
        }
        if ("PRICE_TRACK".equals(str) && "USER_MANAGED".equals(((CommerceSubscription) list.get(0)).d) && Build.VERSION.SDK_INT >= 26) {
            ((C8875pz2) this.f).b();
        }
        if (!this.c) {
            this.d.add(new C2933Wo3(0, list, r0));
            return;
        }
        final ?? r2 = new Callback() { // from class: No3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List list2 = (List) obj;
                final C3063Xo3 c3063Xo3 = this;
                c3063Xo3.getClass();
                int size = list2.size();
                final Callback callback2 = r0;
                if (size == 0) {
                    callback2.onResult(0);
                    return;
                }
                final String str2 = str;
                Callback callback3 = new Callback() { // from class: Ro3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        C3063Xo3 c3063Xo32 = c3063Xo3;
                        c3063Xo32.getClass();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        Callback callback4 = callback2;
                        if (!booleanValue) {
                            callback4.onResult(2);
                        } else {
                            String str3 = str2;
                            c3063Xo32.a(str3, true, new C1374Ko3(str3, callback4, c3063Xo32));
                        }
                    }
                };
                C9743sY c9743sY = c3063Xo3.b;
                c9743sY.getClass();
                if (list2.isEmpty()) {
                    callback3.onResult(Boolean.TRUE);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                try {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(AbstractC5622gY.b((CommerceSubscription) it.next()));
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("subscriptions", jSONArray);
                    jSONObject.put("createShoppingSubscriptionsParams", jSONObject2);
                } catch (JSONException e) {
                    AbstractC4851eH1.a("CSSP", String.format(Locale.US, "Failed to create CreateSubscriptionRequestParams. Details: %s", e.getMessage()), new Object[0]);
                }
                c9743sY.a(jSONObject, callback3);
            }
        };
        N.MCOrSSmL(this.a.a, String.valueOf(((CommerceSubscription) list.get(0)).b), new Callback() { // from class: Qo3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List list2 = (List) obj;
                this.getClass();
                int size = list2.size();
                Callback callback2 = r2;
                List<CommerceSubscription> list3 = list;
                if (size == 0) {
                    callback2.onResult(list3);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                HashMap b = C3063Xo3.b(list2);
                for (CommerceSubscription commerceSubscription : list3) {
                    if (!b.containsKey(CommerceSubscriptionsStorage.a(commerceSubscription))) {
                        arrayList.add(commerceSubscription);
                    }
                }
                callback2.onResult(arrayList);
            }
        });
    }

    public final void a(String str, boolean z, final Callback callback) {
        if (z) {
            final C9743sY c9743sY = this.b;
            c9743sY.getClass();
            AbstractC4133cB0.a(new Callback() { // from class: rY
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C9743sY.this.getClass();
                    String str2 = ((EndpointResponse) obj).a;
                    ArrayList arrayList = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONObject(str2).getJSONArray("subscriptions");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            CommerceSubscription a = AbstractC5622gY.a(jSONArray.getJSONObject(i));
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                    } catch (JSONException e) {
                        AbstractC4851eH1.a("CSSP", String.format(Locale.US, "Failed to deserialize Subscriptions list. Details: %s", e.getMessage()), new Object[0]);
                    }
                    callback.onResult(arrayList);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, c9743sY.a, "susbcriptions_svc", AbstractC7684mY.a() + String.format("?requestParams.subscriptionType=%s", str), "GET", C9743sY.b, "", 1000L, C5463g32.b);
            return;
        }
        N.MCOrSSmL(this.a.a, String.valueOf(str), new Callback() { // from class: Jo3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Callback.this.onResult((List) obj);
            }
        });
    }

    public final void c() {
        final C9743sY c9743sY = this.b;
        c9743sY.getClass();
        AbstractC4133cB0.a(new Callback() { // from class: pY
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                EndpointResponse endpointResponse = (EndpointResponse) obj;
                C9743sY c9743sY2 = C9743sY.this;
                c9743sY2.getClass();
                try {
                    boolean z = new JSONObject(endpointResponse.a).getBoolean("history_recording_enabled");
                    PrefService a = R44.a(c9743sY2.a);
                    if (a != null) {
                        a.e("web_and_app_activity_enabled_for_shopping", z);
                    }
                } catch (JSONException e) {
                    AbstractC4851eH1.a("CSSP", String.format(Locale.US, "Failed to get waa status. Details: %s", e.getMessage()), new Object[0]);
                }
            }
        }, c9743sY.a, "web_history", "https://history.google.com/history/api/lookup?client=web_app", "GET", C9743sY.c, "", 30000L, C5463g32.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Oo3, org.chromium.base.Callback] */
    public final void f(final List list, final Callback callback) {
        final String str = ((CommerceSubscription) list.get(0)).b;
        if (!"PRICE_TRACK".equals(str)) {
            callback.onResult(4);
            return;
        }
        if (list.size() == 0) {
            callback.onResult(0);
            return;
        }
        final ?? r0 = new Callback() { // from class: Oo3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C10993w93 c10993w93;
                C10993w93 c10993w932;
                Integer num = (Integer) obj;
                C3063Xo3 c3063Xo3 = this;
                c3063Xo3.getClass();
                if (num.intValue() == 0) {
                    Iterator it = c3063Xo3.e.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        }
                        BookmarkBridge bookmarkBridge = ((C1295Jz) c11814ya2.next()).a;
                        List<CommerceSubscription> list2 = list;
                        if (list2 == null) {
                            bookmarkBridge.getClass();
                        } else {
                            ArrayList p = bookmarkBridge.p("", 2, -1);
                            if (p.size() != 0) {
                                HashSet hashSet = new HashSet();
                                HashSet hashSet2 = new HashSet();
                                for (CommerceSubscription commerceSubscription : list2) {
                                    if (commerceSubscription != null && commerceSubscription.d.equals("USER_MANAGED")) {
                                        String str2 = commerceSubscription.e;
                                        boolean equals = str2.equals("OFFER_ID");
                                        String str3 = commerceSubscription.c;
                                        if (equals) {
                                            hashSet.add(Long.valueOf(S14.b(str3)));
                                        } else if (str2.equals("PRODUCT_CLUSTER_ID")) {
                                            hashSet2.add(Long.valueOf(S14.b(str3)));
                                        }
                                    }
                                }
                                Iterator it2 = p.iterator();
                                while (it2.hasNext()) {
                                    BookmarkId bookmarkId = (BookmarkId) it2.next();
                                    C0768Fx2 j = bookmarkBridge.j(bookmarkId);
                                    int a = AbstractC1418Kx2.a(j.n);
                                    if (a == 0) {
                                        a = 1;
                                    }
                                    if (a == 2) {
                                        if (j.k == 5) {
                                            c10993w93 = (C10993w93) j.l;
                                        } else {
                                            c10993w93 = C10993w93.r;
                                        }
                                        if (hashSet.contains(Long.valueOf(c10993w93.p)) || hashSet2.contains(Long.valueOf(c10993w93.n))) {
                                            C0508Dx2 c0508Dx2 = (C0508Dx2) C0768Fx2.o.k(j);
                                            if (j.k == 5) {
                                                c10993w932 = (C10993w93) j.l;
                                            } else {
                                                c10993w932 = C10993w93.r;
                                            }
                                            C10650v93 c10650v93 = (C10650v93) C10993w93.r.k(c10993w932);
                                            if (c10650v93.h) {
                                                c10650v93.l();
                                                c10650v93.h = false;
                                            }
                                            C10993w93 c10993w933 = (C10993w93) c10650v93.g;
                                            c10993w933.j |= 16;
                                            c10993w933.o = false;
                                            C10993w93 c10993w934 = (C10993w93) c10650v93.j();
                                            if (c0508Dx2.h) {
                                                c0508Dx2.l();
                                                c0508Dx2.h = false;
                                            }
                                            C0768Fx2 c0768Fx2 = (C0768Fx2) c0508Dx2.g;
                                            c0768Fx2.getClass();
                                            c10993w934.getClass();
                                            c0768Fx2.l = c10993w934;
                                            c0768Fx2.k = 5;
                                            bookmarkBridge.q(bookmarkId, (C0768Fx2) c0508Dx2.j());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                callback.onResult(num);
            }
        };
        if (!this.c) {
            this.d.add(new C2933Wo3(1, list, r0));
            return;
        }
        final HashMap b = b(list);
        N.MCOrSSmL(this.a.a, String.valueOf(str), new Callback() { // from class: Po3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List<CommerceSubscription> list2 = (List) obj;
                final C3063Xo3 c3063Xo3 = C3063Xo3.this;
                c3063Xo3.getClass();
                int size = list2.size();
                final Callback callback2 = r0;
                if (size == 0) {
                    callback2.onResult(0);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (CommerceSubscription commerceSubscription : list2) {
                    if (b.containsKey(CommerceSubscriptionsStorage.a(commerceSubscription))) {
                        arrayList.add(commerceSubscription);
                    }
                }
                if (arrayList.size() == 0) {
                    callback2.onResult(0);
                    return;
                }
                final String str2 = str;
                Callback callback3 = new Callback() { // from class: To3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        C3063Xo3 c3063Xo32 = c3063Xo3;
                        c3063Xo32.getClass();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        Callback callback4 = callback2;
                        if (!booleanValue) {
                            callback4.onResult(2);
                        } else {
                            String str3 = str2;
                            c3063Xo32.a(str3, true, new C1374Ko3(str3, callback4, c3063Xo32));
                        }
                    }
                };
                C9743sY c9743sY = c3063Xo3.b;
                c9743sY.getClass();
                if (arrayList.isEmpty()) {
                    callback3.onResult(Boolean.TRUE);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        long j = ((CommerceSubscription) it.next()).a;
                        if (j != -1) {
                            jSONArray.put(j);
                        }
                    }
                    jSONObject2.put("eventTimestampMicros", jSONArray);
                    jSONObject.put("removeShoppingSubscriptionsParams", jSONObject2);
                } catch (JSONException e) {
                    AbstractC4851eH1.a("CSSP", String.format(Locale.US, "Failed to create RemoveSubscriptionsRequestParams. Details: %s", e.getMessage()), new Object[0]);
                }
                c9743sY.a(jSONObject, callback3);
            }
        });
    }

    public final void e(CommerceSubscription commerceSubscription, Callback callback) {
        if (!"PRICE_TRACK".equals(commerceSubscription.b)) {
            callback.onResult(4);
        } else {
            d(new C2673Uo3(commerceSubscription), callback);
        }
    }

    public final void g(CommerceSubscription commerceSubscription, Callback callback) {
        if (!"PRICE_TRACK".equals(commerceSubscription.b)) {
            callback.onResult(4);
        } else {
            f(new C2803Vo3(commerceSubscription), callback);
        }
    }

    public static HashMap b(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CommerceSubscription commerceSubscription = (CommerceSubscription) it.next();
            hashMap.put(CommerceSubscriptionsStorage.a(commerceSubscription), commerceSubscription);
        }
        return hashMap;
    }
}
