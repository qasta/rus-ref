package ru.gt2.rusref.fias;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

/**
 * Все файлы ФИАС.
 */
public enum Fias {
    STRSTAT(StructureStatuses.class, StructureStatus.class, "14"),
    ACTSTAT(ActualStatuses.class, ActualStatus.class, "08"),
    INTVSTAT(IntervalStatuses.class, IntervalStatus.class, "11"),
    ESTSTAT(EstateStatuses.class, EstateStatus.class, "13"),
    CENTERST(CenterStatuses.class, CenterStatus.class, "10"),
    OPERSTAT(OperationStatuses.class, OperationStatus.class, "09"),
    HSTSTAT(HouseStateStatuses.class, HouseStateStatus.class, "12"),
    CURENTST(CurrentStatuses.class, CurrentStatus.class, "07"),
    SOCRBASE(AddressObjectTypes.class, AddressObjectType.class, "06"),
    LANDMARK(Landmarks.class, Landmark.class, "04"),
    HOUSEINT(HouseIntervals.class, HouseInterval.class, "03"),
    NORMDOC(NormativeDocumentes.class, NormativeDocument.class, "05"),
    ADDROBJ(AddressObjects.class, AddressObject.class, "01"),
    HOUSE(Houses.class, House.class, "02");

    /** Класс обёртки. */
    public final Class<?> wrapper;
    /** Внутренний класс. */
    public final Class<?> item;
    /** Название файла со схемой. */
    public final String schemePrefix;

    private Fias(Class<?> wrapper, Class<?> item, String schemePart) {
        this.wrapper = wrapper;
        this.item = item;
        this.schemePrefix = "AS_" + name() + "_2_250_" + schemePart + "_04_01_";
    }

}
