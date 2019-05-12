export default function reducer (state , action) {
    switch (action.type) {
        case "SET_YEAR":
            return {...state, year: action.payload}
        default:
            return state
    }
}