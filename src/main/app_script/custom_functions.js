/**
 * Multiplies the input value by 2.
 *
 * @param {number} input The value to multiply.
 * @return The input multiplied by 2.
 * @customfunction
 */
function DOUBLE(input) {
  return mult(input, 2);
}

function onOpen(e) {
  app_script.core.add_menu();
}


