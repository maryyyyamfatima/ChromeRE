package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KE0 {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final HE0 E;
    public static final HE0[][] F;
    public static final HE0[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashSet f11450J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        HE0[] he0Arr = {new HE0(254, 4, "NewSubfileType"), new HE0(255, 4, "SubfileType"), new HE0(256, "ImageWidth", 3, 4), new HE0(257, "ImageLength", 3, 4), new HE0(258, 3, "BitsPerSample"), new HE0(259, 3, "Compression"), new HE0(262, 3, "PhotometricInterpretation"), new HE0(270, 2, "ImageDescription"), new HE0(271, 2, "Make"), new HE0(272, 2, "Model"), new HE0(273, "StripOffsets", 3, 4), new HE0(274, 3, "Orientation"), new HE0(277, 3, "SamplesPerPixel"), new HE0(278, "RowsPerStrip", 3, 4), new HE0(279, "StripByteCounts", 3, 4), new HE0(282, 5, "XResolution"), new HE0(283, 5, "YResolution"), new HE0(284, 3, "PlanarConfiguration"), new HE0(296, 3, "ResolutionUnit"), new HE0(301, 3, "TransferFunction"), new HE0(305, 2, "Software"), new HE0(306, 2, "DateTime"), new HE0(315, 2, "Artist"), new HE0(318, 5, "WhitePoint"), new HE0(319, 5, "PrimaryChromaticities"), new HE0(330, 4, "SubIFDPointer"), new HE0(513, 4, "JPEGInterchangeFormat"), new HE0(514, 4, "JPEGInterchangeFormatLength"), new HE0(529, 5, "YCbCrCoefficients"), new HE0(530, 3, "YCbCrSubSampling"), new HE0(531, 3, "YCbCrPositioning"), new HE0(532, 5, "ReferenceBlackWhite"), new HE0(33432, 2, "Copyright"), new HE0(34665, 4, "ExifIFDPointer"), new HE0(34853, 4, "GPSInfoIFDPointer"), new HE0(4, 4, "SensorTopBorder"), new HE0(5, 4, "SensorLeftBorder"), new HE0(6, 4, "SensorBottomBorder"), new HE0(7, 4, "SensorRightBorder"), new HE0(23, 3, "ISO"), new HE0(46, 7, "JpgFromRaw"), new HE0(700, 1, "Xmp")};
        HE0[] he0Arr2 = {new HE0(33434, 5, "ExposureTime"), new HE0(33437, 5, "FNumber"), new HE0(34850, 3, "ExposureProgram"), new HE0(34852, 2, "SpectralSensitivity"), new HE0(34855, 3, "PhotographicSensitivity"), new HE0(34856, 7, "OECF"), new HE0(34864, 3, "SensitivityType"), new HE0(34865, 4, "StandardOutputSensitivity"), new HE0(34866, 4, "RecommendedExposureIndex"), new HE0(34867, 4, "ISOSpeed"), new HE0(34868, 4, "ISOSpeedLatitudeyyy"), new HE0(34869, 4, "ISOSpeedLatitudezzz"), new HE0(36864, 2, "ExifVersion"), new HE0(36867, 2, "DateTimeOriginal"), new HE0(36868, 2, "DateTimeDigitized"), new HE0(36880, 2, "OffsetTime"), new HE0(36881, 2, "OffsetTimeOriginal"), new HE0(36882, 2, "OffsetTimeDigitized"), new HE0(37121, 7, "ComponentsConfiguration"), new HE0(37122, 5, "CompressedBitsPerPixel"), new HE0(37377, 10, "ShutterSpeedValue"), new HE0(37378, 5, "ApertureValue"), new HE0(37379, 10, "BrightnessValue"), new HE0(37380, 10, "ExposureBiasValue"), new HE0(37381, 5, "MaxApertureValue"), new HE0(37382, 5, "SubjectDistance"), new HE0(37383, 3, "MeteringMode"), new HE0(37384, 3, "LightSource"), new HE0(37385, 3, "Flash"), new HE0(37386, 5, "FocalLength"), new HE0(37396, 3, "SubjectArea"), new HE0(37500, 7, "MakerNote"), new HE0(37510, 7, "UserComment"), new HE0(37520, 2, "SubSecTime"), new HE0(37521, 2, "SubSecTimeOriginal"), new HE0(37522, 2, "SubSecTimeDigitized"), new HE0(40960, 7, "FlashpixVersion"), new HE0(40961, 3, "ColorSpace"), new HE0(40962, "PixelXDimension", 3, 4), new HE0(40963, "PixelYDimension", 3, 4), new HE0(40964, 2, "RelatedSoundFile"), new HE0(40965, 4, "InteroperabilityIFDPointer"), new HE0(41483, 5, "FlashEnergy"), new HE0(41484, 7, "SpatialFrequencyResponse"), new HE0(41486, 5, "FocalPlaneXResolution"), new HE0(41487, 5, "FocalPlaneYResolution"), new HE0(41488, 3, "FocalPlaneResolutionUnit"), new HE0(41492, 3, "SubjectLocation"), new HE0(41493, 5, "ExposureIndex"), new HE0(41495, 3, "SensingMethod"), new HE0(41728, 7, "FileSource"), new HE0(41729, 7, "SceneType"), new HE0(41730, 7, "CFAPattern"), new HE0(41985, 3, "CustomRendered"), new HE0(41986, 3, "ExposureMode"), new HE0(41987, 3, "WhiteBalance"), new HE0(41988, 5, "DigitalZoomRatio"), new HE0(41989, 3, "FocalLengthIn35mmFilm"), new HE0(41990, 3, "SceneCaptureType"), new HE0(41991, 3, "GainControl"), new HE0(41992, 3, "Contrast"), new HE0(41993, 3, "Saturation"), new HE0(41994, 3, "Sharpness"), new HE0(41995, 7, "DeviceSettingDescription"), new HE0(41996, 3, "SubjectDistanceRange"), new HE0(42016, 2, "ImageUniqueID"), new HE0(42032, 2, "CameraOwnerName"), new HE0(42033, 2, "BodySerialNumber"), new HE0(42034, 5, "LensSpecification"), new HE0(42035, 2, "LensMake"), new HE0(42036, 2, "LensModel"), new HE0(42240, 5, "Gamma"), new HE0(50706, 1, "DNGVersion"), new HE0(50720, "DefaultCropSize", 3, 4)};
        HE0[] he0Arr3 = {new HE0(0, 1, "GPSVersionID"), new HE0(1, 2, "GPSLatitudeRef"), new HE0(2, "GPSLatitude", 5, 10), new HE0(3, 2, "GPSLongitudeRef"), new HE0(4, "GPSLongitude", 5, 10), new HE0(5, 1, "GPSAltitudeRef"), new HE0(6, 5, "GPSAltitude"), new HE0(7, 5, "GPSTimeStamp"), new HE0(8, 2, "GPSSatellites"), new HE0(9, 2, "GPSStatus"), new HE0(10, 2, "GPSMeasureMode"), new HE0(11, 5, "GPSDOP"), new HE0(12, 2, "GPSSpeedRef"), new HE0(13, 5, "GPSSpeed"), new HE0(14, 2, "GPSTrackRef"), new HE0(15, 5, "GPSTrack"), new HE0(16, 2, "GPSImgDirectionRef"), new HE0(17, 5, "GPSImgDirection"), new HE0(18, 2, "GPSMapDatum"), new HE0(19, 2, "GPSDestLatitudeRef"), new HE0(20, 5, "GPSDestLatitude"), new HE0(21, 2, "GPSDestLongitudeRef"), new HE0(22, 5, "GPSDestLongitude"), new HE0(23, 2, "GPSDestBearingRef"), new HE0(24, 5, "GPSDestBearing"), new HE0(25, 2, "GPSDestDistanceRef"), new HE0(26, 5, "GPSDestDistance"), new HE0(27, 7, "GPSProcessingMethod"), new HE0(28, 7, "GPSAreaInformation"), new HE0(29, 2, "GPSDateStamp"), new HE0(30, 3, "GPSDifferential"), new HE0(31, 5, "GPSHPositioningError")};
        HE0[] he0Arr4 = {new HE0(1, 2, "InteroperabilityIndex")};
        HE0[] he0Arr5 = {new HE0(254, 4, "NewSubfileType"), new HE0(255, 4, "SubfileType"), new HE0(256, "ThumbnailImageWidth", 3, 4), new HE0(257, "ThumbnailImageLength", 3, 4), new HE0(258, 3, "BitsPerSample"), new HE0(259, 3, "Compression"), new HE0(262, 3, "PhotometricInterpretation"), new HE0(270, 2, "ImageDescription"), new HE0(271, 2, "Make"), new HE0(272, 2, "Model"), new HE0(273, "StripOffsets", 3, 4), new HE0(274, 3, "ThumbnailOrientation"), new HE0(277, 3, "SamplesPerPixel"), new HE0(278, "RowsPerStrip", 3, 4), new HE0(279, "StripByteCounts", 3, 4), new HE0(282, 5, "XResolution"), new HE0(283, 5, "YResolution"), new HE0(284, 3, "PlanarConfiguration"), new HE0(296, 3, "ResolutionUnit"), new HE0(301, 3, "TransferFunction"), new HE0(305, 2, "Software"), new HE0(306, 2, "DateTime"), new HE0(315, 2, "Artist"), new HE0(318, 5, "WhitePoint"), new HE0(319, 5, "PrimaryChromaticities"), new HE0(330, 4, "SubIFDPointer"), new HE0(513, 4, "JPEGInterchangeFormat"), new HE0(514, 4, "JPEGInterchangeFormatLength"), new HE0(529, 5, "YCbCrCoefficients"), new HE0(530, 3, "YCbCrSubSampling"), new HE0(531, 3, "YCbCrPositioning"), new HE0(532, 5, "ReferenceBlackWhite"), new HE0(700, 1, "Xmp"), new HE0(33432, 2, "Copyright"), new HE0(34665, 4, "ExifIFDPointer"), new HE0(34853, 4, "GPSInfoIFDPointer"), new HE0(50706, 1, "DNGVersion"), new HE0(50720, "DefaultCropSize", 3, 4)};
        E = new HE0(273, 3, "StripOffsets");
        F = new HE0[][]{he0Arr, he0Arr2, he0Arr3, he0Arr4, he0Arr5, he0Arr, new HE0[]{new HE0(256, 7, "ThumbnailImage"), new HE0(8224, 4, "CameraSettingsIFDPointer"), new HE0(8256, 4, "ImageProcessingIFDPointer")}, new HE0[]{new HE0(257, 4, "PreviewImageStart"), new HE0(258, 4, "PreviewImageLength")}, new HE0[]{new HE0(4371, 3, "AspectFrame")}, new HE0[]{new HE0(55, 3, "ColorSpace")}};
        G = new HE0[]{new HE0(330, 4, "SubIFDPointer"), new HE0(34665, 4, "ExifIFDPointer"), new HE0(34853, 4, "GPSInfoIFDPointer"), new HE0(40965, 4, "InteroperabilityIFDPointer"), new HE0(8224, 1, "CameraSettingsIFDPointer"), new HE0(8256, 1, "ImageProcessingIFDPointer")};
        H = new HashMap[10];
        I = new HashMap[10];
        f11450J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            HE0[][] he0Arr6 = F;
            if (i < he0Arr6.length) {
                H[i] = new HashMap();
                I[i] = new HashMap();
                for (HE0 he0 : he0Arr6[i]) {
                    H[i].put(Integer.valueOf(he0.a), he0);
                    I[i].put(he0.b, he0);
                }
                i++;
            } else {
                HashMap hashMap = K;
                HE0[] he0Arr7 = G;
                hashMap.put(Integer.valueOf(he0Arr7[0].a), 5);
                hashMap.put(Integer.valueOf(he0Arr7[1].a), 1);
                hashMap.put(Integer.valueOf(he0Arr7[2].a), 2);
                hashMap.put(Integer.valueOf(he0Arr7[3].a), 3);
                hashMap.put(Integer.valueOf(he0Arr7[4].a), 7);
                hashMap.put(Integer.valueOf(he0Arr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public KE0(InputStream inputStream) {
        boolean z2;
        HE0[][] he0Arr = F;
        this.d = new HashMap[he0Arr.length];
        this.e = new HashSet(he0Arr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    this.b = null;
                    this.a = fileInputStream.getFD();
                }
            }
            this.b = null;
            this.a = null;
        }
        boolean z3 = l;
        for (int i = 0; i < he0Arr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z3) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    if (!z3) {
                        return;
                    }
                }
            } finally {
                a();
                if (z3) {
                    p();
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f = f(bufferedInputStream);
        this.c = f;
        if ((f == 4 || f == 9 || f == 13 || f == 14) ? false : true) {
            JE0 je0 = new JE0(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 12) {
                d(je0);
            } else if (i2 == 7) {
                g(je0);
            } else if (i2 == 10) {
                k(je0);
            } else {
                j(je0);
            }
            je0.c(this.h);
            u(je0);
        } else {
            FE0 fe0 = new FE0(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 4) {
                e(fe0, 0, 0);
            } else if (i3 == 13) {
                h(fe0);
            } else if (i3 == 9) {
                i(fe0);
            } else if (i3 == 14) {
                l(fe0);
            }
        }
        a();
        if (!z3) {
        }
    }

    public final GE0 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            GE0 ge0 = (GE0) this.d[i].get(str);
            if (ge0 != null) {
                return ge0;
            }
        }
        return null;
    }

    public final String b(String str) {
        GE0 c = c(str);
        if (c != null) {
            if (!f11450J.contains(str)) {
                return c.g(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c.a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                IE0[] ie0Arr = (IE0[]) c.h(this.f);
                if (ie0Arr == null || ie0Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(ie0Arr));
                    return null;
                }
                IE0 ie0 = ie0Arr[0];
                IE0 ie02 = ie0Arr[1];
                IE0 ie03 = ie0Arr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) ie0.a) / ((float) ie0.b))), Integer.valueOf((int) (((float) ie02.a) / ((float) ie02.b))), Integer.valueOf((int) (((float) ie03.a) / ((float) ie03.b))));
            }
            try {
                return Double.toString(c.e(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                GE0 ge0 = (GE0) entry.getValue();
                ge0.toString();
                ge0.g(this.f);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00c0, code lost:            if (r6 == null) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:            r7 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE0.f(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0151, code lost:            r23.h = r22.f;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d A[LOOP:0: B:9:0x0024->B:32:0x013d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.FE0 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE0.e(FE0, int, int):void");
    }

    public final void j(JE0 je0) {
        o(je0);
        s(je0, 0);
        w(je0, 0);
        w(je0, 5);
        w(je0, 4);
        x();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            GE0 ge0 = (GE0) hashMapArr[1].get("MakerNote");
            if (ge0 != null) {
                JE0 je02 = new JE0(ge0.d);
                je02.h = this.f;
                je02.b(6);
                s(je02, 9);
                GE0 ge02 = (GE0) hashMapArr[9].get("ColorSpace");
                if (ge02 != null) {
                    hashMapArr[1].put("ColorSpace", ge02);
                }
            }
        }
    }

    public final void i(FE0 fe0) {
        if (l) {
            Objects.toString(fe0);
        }
        fe0.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        fe0.readFully(bArr);
        fe0.readFully(bArr2);
        fe0.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        fe0.b(i - fe0.g);
        fe0.readFully(bArr4);
        e(new FE0(bArr4), i, 5);
        fe0.b(i3 - fe0.g);
        fe0.h = ByteOrder.BIG_ENDIAN;
        int readInt = fe0.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = fe0.readUnsignedShort();
            int readUnsignedShort2 = fe0.readUnsignedShort();
            if (readUnsignedShort == E.a) {
                short readShort = fe0.readShort();
                short readShort2 = fe0.readShort();
                GE0 d = GE0.d(readShort, this.f);
                GE0 d2 = GE0.d(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", d);
                hashMapArr[0].put("ImageWidth", d2);
                return;
            }
            fe0.b(readUnsignedShort2);
        }
    }

    public final void d(JE0 je0) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(new EE0(je0));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", GE0.d(Integer.parseInt(str), this.f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", GE0.d(Integer.parseInt(str2), this.f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        hashMapArr[0].put("Orientation", GE0.d(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 <= 6) {
                            throw new IOException("Invalid exif length");
                        }
                        je0.c(parseInt2);
                        byte[] bArr = new byte[6];
                        je0.readFully(bArr);
                        int i = parseInt2 + 6;
                        int i2 = parseInt3 - 6;
                        if (!Arrays.equals(bArr, M)) {
                            throw new IOException("Invalid identifier");
                        }
                        byte[] bArr2 = new byte[i2];
                        je0.readFully(bArr2);
                        this.h = i;
                        r(0, bArr2);
                    }
                    String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                    String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                    if (extractMetadata5 != null && extractMetadata6 != null) {
                        int parseInt4 = Integer.parseInt(extractMetadata5);
                        int parseInt5 = Integer.parseInt(extractMetadata6);
                        long j = parseInt4;
                        je0.c(j);
                        byte[] bArr3 = new byte[parseInt5];
                        je0.readFully(bArr3);
                        if (b("Xmp") == null) {
                            hashMapArr[0].put("Xmp", new GE0(j, bArr3, 1, parseInt5));
                        }
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void g(JE0 je0) {
        int i;
        int i2;
        j(je0);
        HashMap[] hashMapArr = this.d;
        GE0 ge0 = (GE0) hashMapArr[1].get("MakerNote");
        if (ge0 != null) {
            JE0 je02 = new JE0(ge0.d);
            je02.h = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            je02.readFully(bArr2);
            je02.c(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            je02.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                je02.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                je02.c(12L);
            }
            s(je02, 6);
            GE0 ge02 = (GE0) hashMapArr[7].get("PreviewImageStart");
            GE0 ge03 = (GE0) hashMapArr[7].get("PreviewImageLength");
            if (ge02 != null && ge03 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", ge02);
                hashMapArr[5].put("JPEGInterchangeFormatLength", ge03);
            }
            GE0 ge04 = (GE0) hashMapArr[8].get("AspectFrame");
            if (ge04 != null) {
                int[] iArr = (int[]) ge04.h(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                GE0 d = GE0.d(i5, this.f);
                GE0 d2 = GE0.d(i6, this.f);
                hashMapArr[0].put("ImageWidth", d);
                hashMapArr[0].put("ImageLength", d2);
            }
        }
    }

    public final void k(JE0 je0) {
        if (l) {
            Objects.toString(je0);
        }
        j(je0);
        HashMap[] hashMapArr = this.d;
        GE0 ge0 = (GE0) hashMapArr[0].get("JpgFromRaw");
        if (ge0 != null) {
            e(new FE0(ge0.d), (int) ge0.c, 5);
        }
        GE0 ge02 = (GE0) hashMapArr[0].get("ISO");
        GE0 ge03 = (GE0) hashMapArr[1].get("PhotographicSensitivity");
        if (ge02 == null || ge03 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", ge02);
    }

    public final void h(FE0 fe0) {
        if (l) {
            Objects.toString(fe0);
        }
        fe0.h = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        fe0.b(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = fe0.readInt();
                byte[] bArr2 = new byte[4];
                fe0.readFully(bArr2);
                int i = length + 4 + 4;
                if (i == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[readInt];
                    fe0.readFully(bArr3);
                    int readInt2 = fe0.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) != readInt2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    this.h = i;
                    r(0, bArr3);
                    x();
                    u(new FE0(bArr3));
                    return;
                }
                int i2 = readInt + 4;
                fe0.b(i2);
                length = i + i2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(FE0 fe0) {
        if (l) {
            Objects.toString(fe0);
        }
        fe0.h = ByteOrder.LITTLE_ENDIAN;
        fe0.b(y.length);
        int readInt = fe0.readInt() + 8;
        byte[] bArr = z;
        fe0.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                fe0.readFully(bArr2);
                int readInt2 = fe0.readInt();
                int i = length + 4 + 4;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    fe0.readFully(bArr3);
                    this.h = i;
                    r(0, bArr3);
                    u(new FE0(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                fe0.b(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(int i, byte[] bArr) {
        JE0 je0 = new JE0(bArr);
        o(je0);
        s(je0, i);
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", GE0.a(b));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", GE0.b(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", GE0.b(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", GE0.b(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", GE0.b(0L, this.f));
        }
    }

    public static ByteOrder q(FE0 fe0) {
        short readShort = fe0.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void o(FE0 fe0) {
        ByteOrder q2 = q(fe0);
        this.f = q2;
        fe0.h = q2;
        int readUnsignedShort = fe0.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fe0.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC9076qb1.a("Invalid first Ifd offset: ", readInt));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            fe0.b(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.FE0 r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE0.u(FE0):void");
    }

    public final void m(FE0 fe0, HashMap hashMap) {
        GE0 ge0 = (GE0) hashMap.get("JPEGInterchangeFormat");
        GE0 ge02 = (GE0) hashMap.get("JPEGInterchangeFormatLength");
        if (ge0 == null || ge02 == null) {
            return;
        }
        int f = ge0.f(this.f);
        int f2 = ge02.f(this.f);
        if (this.c == 7) {
            f += this.i;
        }
        if (f <= 0 || f2 <= 0 || this.b != null || this.a != null) {
            return;
        }
        fe0.b(f);
        fe0.readFully(new byte[f2]);
    }

    public final boolean n(HashMap hashMap) {
        GE0 ge0 = (GE0) hashMap.get("ImageLength");
        GE0 ge02 = (GE0) hashMap.get("ImageWidth");
        if (ge0 == null || ge02 == null) {
            return false;
        }
        return ge0.f(this.f) <= 512 && ge02.f(this.f) <= 512;
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        GE0 ge0 = (GE0) hashMapArr[1].get("PixelXDimension");
        GE0 ge02 = (GE0) hashMapArr[1].get("PixelYDimension");
        if (ge0 != null && ge02 != null) {
            hashMapArr[0].put("ImageWidth", ge0);
            hashMapArr[0].put("ImageLength", ge02);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        n(hashMapArr[4]);
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void w(JE0 je0, int i) {
        GE0 d;
        GE0 d2;
        HashMap[] hashMapArr = this.d;
        GE0 ge0 = (GE0) hashMapArr[i].get("DefaultCropSize");
        GE0 ge02 = (GE0) hashMapArr[i].get("SensorTopBorder");
        GE0 ge03 = (GE0) hashMapArr[i].get("SensorLeftBorder");
        GE0 ge04 = (GE0) hashMapArr[i].get("SensorBottomBorder");
        GE0 ge05 = (GE0) hashMapArr[i].get("SensorRightBorder");
        if (ge0 != null) {
            if (ge0.a == 5) {
                IE0[] ie0Arr = (IE0[]) ge0.h(this.f);
                if (ie0Arr == null || ie0Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(ie0Arr));
                    return;
                }
                d = GE0.c(ie0Arr[0], this.f);
                d2 = GE0.c(ie0Arr[1], this.f);
            } else {
                int[] iArr = (int[]) ge0.h(this.f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                d = GE0.d(iArr[0], this.f);
                d2 = GE0.d(iArr[1], this.f);
            }
            hashMapArr[i].put("ImageWidth", d);
            hashMapArr[i].put("ImageLength", d2);
            return;
        }
        if (ge02 == null || ge03 == null || ge04 == null || ge05 == null) {
            GE0 ge06 = (GE0) hashMapArr[i].get("ImageLength");
            GE0 ge07 = (GE0) hashMapArr[i].get("ImageWidth");
            if (ge06 == null || ge07 == null) {
                GE0 ge08 = (GE0) hashMapArr[i].get("JPEGInterchangeFormat");
                GE0 ge09 = (GE0) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (ge08 == null || ge09 == null) {
                    return;
                }
                int f = ge08.f(this.f);
                int f2 = ge08.f(this.f);
                je0.c(f);
                byte[] bArr = new byte[f2];
                je0.readFully(bArr);
                e(new FE0(bArr), f, i);
                return;
            }
            return;
        }
        int f3 = ge02.f(this.f);
        int f4 = ge04.f(this.f);
        int f5 = ge05.f(this.f);
        int f6 = ge03.f(this.f);
        if (f4 <= f3 || f5 <= f6) {
            return;
        }
        GE0 d3 = GE0.d(f4 - f3, this.f);
        GE0 d4 = GE0.d(f5 - f6, this.f);
        hashMapArr[i].put("ImageLength", d3);
        hashMapArr[i].put("ImageWidth", d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.JE0 r31, int r32) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE0.s(JE0, int):void");
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        GE0 ge0 = (GE0) hashMapArr[i].get("ImageLength");
        GE0 ge02 = (GE0) hashMapArr[i].get("ImageWidth");
        GE0 ge03 = (GE0) hashMapArr[i2].get("ImageLength");
        GE0 ge04 = (GE0) hashMapArr[i2].get("ImageWidth");
        if (ge0 == null || ge02 == null || ge03 == null || ge04 == null) {
            return;
        }
        int f = ge0.f(this.f);
        int f2 = ge02.f(this.f);
        int f3 = ge03.f(this.f);
        int f4 = ge04.f(this.f);
        if (f >= f3 || f2 >= f4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (GE0) hashMap.get(str));
        hashMapArr[i].remove(str);
    }
}
